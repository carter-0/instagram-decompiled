package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WMt  reason: case insensitive filesystem */
public final class C19137WMt implements 2IR {
    public int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00 = 0;
    }

    public C19137WMt(UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onFailure(Throwable th) {
        int i = this.A00;
        if (i < 7) {
            this.A00 = i + 1;
            C16909VAm.A00(this, this.A01, this.A02);
        }
    }
}
