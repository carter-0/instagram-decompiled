package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.FmQ  reason: case insensitive filesystem */
public final class C50977FmQ implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C50977FmQ(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void D9V() {
        if (this.A00 != 0) {
            SUD.A07((AndroidLink) this.A02, (Q03) this.A01, (AnonymousClass37D) this.A03, this.A05, this.A04);
            return;
        }
        E0f e0f = (E0f) this.A03;
        C49950FGf.A01((Context) this.A02, (FragmentActivity) this.A01, e0f, AnonymousClass7TE.A0l(e0f.A00), this.A04, this.A05, "feed", "share_from_media_creation");
    }

    public final void D9a() {
    }
}
