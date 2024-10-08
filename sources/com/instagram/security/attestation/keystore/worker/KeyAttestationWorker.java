package com.instagram.security.attestation.keystore.worker;

import X.0nV;
import X.0qQ;
import X.AnonymousClass12T;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class KeyAttestationWorker extends CoroutineWorker {
    public final 0nV A00 = AnonymousClass12T.A00.CO6(1800671267, 3);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        0qQ.A0B(context, 1);
        0qQ.A0B(workerParameters, 2);
    }
}
