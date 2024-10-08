package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;

public interface zzr extends IInterface {
    void FPM(PendingIntent pendingIntent, Status status);
}
