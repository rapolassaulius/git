package lt.swedbank.itacademy.comparators;

import lt.swedbank.itacademy.domain.Account;

import java.util.Comparator;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class CompareByBalance implements Comparator<Account> {
  @Override
  public int compare(Account o1, Account o2) {
    return -1*o1.getBalance().compareTo(o2.getBalance());
  }
}
