package Java1.Task4_2_8;

public class Main implements RobotConnectionManager {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {

        int count = -1;
        RobotConnection robotConnection = new RobotConnection() {
            private RobotConnection robotConnection;

            @Override
            public void moveRobotTo(int x, int y) {
            }

            @Override
            public void close() {
                this.robotConnection.close();
            }
        };
        {

            do {
                count++;
                if (count < 2) {
                    try {
                        robotConnectionManager.getConnection();
                        robotConnection.moveRobotTo(toX, toY);
                    } catch (Exception ignored) {

                    } finally {
                        try {
                            robotConnection.close();
                        } catch (Exception ignored) {
                            robotConnection.close();
                        }

                    }


                } else {
                    try {
                        robotConnectionManager.getConnection();
                        robotConnection.moveRobotTo(toX, toY);
                    } catch (RobotConnectionException e) {
                        robotConnection.close();
                    } finally {
                        try {
                            robotConnection.close();
                        } catch (Exception ignored) {
                            robotConnection.close();
                        }

                    }
                }
                try {
                    robotConnection.close();
                } catch (Exception ignored) {
                } finally {
                    robotConnection.close();
                }
            }
            while (count < 2);
        }

    }


    @Override
    public RobotConnection getConnection() {
        return null;
    }

    public static void main(String[] args) throws RobotConnectionException{
        RobotConnectionManager robotConnectionManager = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return null;
            }


            public void moveRobotTo(int x, int y) {

            }

            public void close() {

            }
        };
        moveRobot(robotConnectionManager, 4, 5);

    }
}

