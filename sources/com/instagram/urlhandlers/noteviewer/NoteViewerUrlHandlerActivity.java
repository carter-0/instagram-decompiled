package com.instagram.urlhandlers.noteviewer;

import X.0Gl;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class NoteViewerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.noteviewer.NoteViewerUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A00 = AnonymousClass0fD.A00(829823834);
        super.onCreate(bundle);
        0Gl.A00(DbS.A0S(this));
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0) {
            finish();
            i = 683735614;
        } else {
            Intent data = DbX.A08(this).setData(DbT.A09(A0m));
            0qQ.A07(data);
            DbV.A19(this, data);
            finish();
            i = -343270646;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
