package X;

import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.8Cr  reason: invalid class name and case insensitive filesystem */
public final class C352268Cr implements C352278Cs, AnonymousClass89Y {
    public AnonymousClass8LU A00;
    public AnonymousClass8LU A01;
    public C314446iH A02;
    public ClipInfo A03;
    public C349307zv A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final UserSession A08;
    public final C352308Cv A09;
    public final String A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C377269Le(this, 23));
    public final AnonymousClass0eM A0C;
    public final AnonymousClass80U A0D;
    public final C3493580b A0E;

    public C352268Cr(ViewStub viewStub, Fragment fragment, UserSession userSession, C314446iH r6, AnonymousClass80U r7, String str) {
        0qQ.A0B(fragment, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(viewStub, 4);
        this.A07 = fragment;
        this.A08 = userSession;
        this.A0D = r7;
        this.A0A = str;
        this.A02 = r6;
        this.A0C = AnonymousClass0eN.A01(new C377269Le(viewStub, 24));
        C352288Ct r1 = new C352288Ct(this);
        this.A0E = r1;
        this.A09 = new C352298Cu(this);
        r7.A7w(r1);
    }

    public final void Dxn(int i) {
        if (!this.A06) {
            Object value = this.A0B.getValue();
            0qQ.A07(value);
            ((ClipsTrimFilmstrip) value).setSeekPosition(i);
        }
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
