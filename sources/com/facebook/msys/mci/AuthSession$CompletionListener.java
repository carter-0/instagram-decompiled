package com.facebook.msys.mci;

public interface AuthSession$CompletionListener {
    void onAuthComplete(AuthData authData, RedactedString redactedString, Throwable th);
}
