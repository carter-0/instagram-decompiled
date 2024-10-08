package X;

public interface MTS {
    void onFailure(Exception exc);

    void onSuccess(Object obj);
}
