package Java1.Task3_3_13;

public class Task3_3_13 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -10, 20);
        System.out.println("X:" + robot.getX() + " Y: " + robot.getY());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getY() != toY) {
            if (robot.getY() < toY) {
                switch (robot.getDirection()) {
                    case UP: {
                        break;
                    }
                    case DOWN: {
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    }
                    case LEFT: {
                        robot.turnRight();
                        break;
                    }
                    case RIGHT: {
                        robot.turnLeft();
                        break;
                    }
                }
            } else {
                switch (robot.getDirection()) {
                    case UP: {
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    }
                    case LEFT: {
                        robot.turnLeft();
                        break;
                    }
                    case RIGHT: {
                        robot.turnRight();
                        break;
                    }
                }
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

        if (robot.getX() != toX) {
            if (robot.getX() < toX) {
                switch (robot.getDirection()) {
                    case LEFT: {
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    }
                    case UP: {
                        robot.turnRight();
                        break;
                    }
                    case DOWN: {
                        robot.turnLeft();
                        break;
                    }
                }
            } else {
                switch (robot.getDirection()) {
                    case RIGHT: {
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    }
                    case UP: {
                        robot.turnLeft();
                        break;
                    }
                    case DOWN: {
                        robot.turnRight();
                        break;
                    }
                }
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}