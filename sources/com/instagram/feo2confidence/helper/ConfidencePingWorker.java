package com.instagram.feo2confidence.helper;

import X.09i;
import X.0wb;
import X.1ES;
import X.AnonymousClass4D7;
import X.AnonymousClass5G1;
import X.AnonymousClass7TG;
import X.C11032S6k;
import X.C11239SGz;
import X.C282925Fh;
import X.C64428Lbj;
import X.DbS;
import X.KH7;
import X.LAY;
import X.LQW;
import X.RW4;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.common.session.UserSession;

public final class ConfidencePingWorker extends CoroutineWorker {
    /* JADX WARNING: type inference failed for: r6v0, types: [X.LAY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.1Tr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.KH7, X.11X] */
    public final Object A03(AnonymousClass4D7 r8) {
        try {
            UserSession A08 = 09i.A0A.A08(this);
            C11032S6k s6k = LAY.A07;
            Context context = this.mAppContext;
            ? obj = new Object();
            obj.A01 = context;
            obj.A00 = context.getApplicationContext().getContentResolver();
            C64428Lbj lbj = new C64428Lbj(obj, 2);
            obj.A04 = lbj;
            ? obj2 = new Object();
            obj2.A00 = lbj;
            obj.A03 = obj2;
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            obj.A02 = packageManager;
            obj.A06 = new LQW(obj.A00, RW4.A00(packageManager), obj.A03, obj.A04);
            obj.A05 = new C11239SGz(obj.A01, obj.A02);
            DbS.A1Z(A08);
            1ES.A03(new KH7(1, obj, A08));
            return new AnonymousClass5G1();
        } catch (Exception e) {
            0wb.A06("ConfidencePingWorker", "Exception upon do work", e);
            return new C282925Fh();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfidencePingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
