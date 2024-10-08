package com.instagram.process.secondary;

import X.00l;
import X.0Iz;
import X.0KC;
import X.0dV;
import X.0kT;
import X.0qQ;
import X.AnonymousClass0J1;
import X.AnonymousClass0eX;
import X.AnonymousClass2DC;
import X.AnonymousClass7TE;
import X.C11327SNe;
import X.C66580MXl;
import X.JTR;
import android.content.Context;
import android.os.AsyncTask;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class InstagramApplicationForSecondaryProcess extends 0kT {
    public final Class TAG = InstagramApplicationForSecondaryProcess.class;

    public File getCacheDir(File file) {
        0qQ.A0B(file, 0);
        Context context = this.context;
        0qQ.A0B(context, 0);
        if (AnonymousClass2DC.A00) {
            File A00 = AnonymousClass0eX.A00(context, 486209204);
            A00.mkdirs();
            if (A00.isDirectory() || A00.mkdirs()) {
                return A00;
            }
        }
        return file;
    }

    public File getDirOverride(String str, int i) {
        0qQ.A0B(str, 0);
        Context context = this.context;
        0qQ.A0B(context, 0);
        if (!AnonymousClass2DC.A00 || !"webview".equals(str)) {
            return null;
        }
        File A00 = AnonymousClass0eX.A00(context, 372754419);
        A00.mkdirs();
        return A00;
    }

    public void onCreate(String str, long j, long j2, long j3, long j4) {
        0qQ.A0B(str, 0);
        0kT._processName = str;
        if (str.length() == 0) {
            throw AnonymousClass7TE.A0z("Can't find current process's name");
        }
        0KC.A00(6);
        0dV.A05(this.context);
        try {
            0dV.A0C("c++_shared");
            BreakpadManager.start(this.context);
        } catch (Throwable th) {
            0KC.A05(this.TAG, "Can't load breakpad", th);
        }
        C11327SNe sNe = C11327SNe.A06;
        Context context = this.context;
        int A04 = 00l.A04(str, ':', 0);
        if (A04 != -1) {
            str = C66580MXl.A0z(str, A04 + 1);
        }
        sNe.A00 = context;
        sNe.A02 = str;
        sNe.A03.postDelayed(sNe.A04, JTR.A0N(TimeUnit.MINUTES));
        AsyncTask.execute(new 0Iz(this.context, AnonymousClass0J1.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramApplicationForSecondaryProcess(Context context) {
        super(context);
        0qQ.A0D(context, "context");
    }
}
