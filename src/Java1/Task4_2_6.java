package Java1;

public class Task4_2_6 {
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {

        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException e) {
        }

        return false;
    }

    class BankClient {
    }

    interface BankWorker {
        boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
    }

    class BadCreditHistoryException extends Exception {

        BadCreditHistoryException(String description) {
            super(description);
        }
    }

    class ProblemWithLawException extends Exception {

        ProblemWithLawException() {
        }
    }
}
