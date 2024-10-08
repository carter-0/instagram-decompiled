package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Ngv  reason: case insensitive filesystem */
public final class C69197Ngv extends C2806552w {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C70802Vt A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69197Ngv(FragmentActivity fragmentActivity, C70802Vt r3, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        super(Integer.valueOf(i));
        this.A01 = r3;
        this.A09 = str;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A05 = str2;
        this.A0A = z;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = l;
        this.A06 = str5;
        this.A03 = num;
    }

    public final void onClick(View view) {
        C70802Vt r1 = this.A01;
        if (r1 != null) {
            r1.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
        }
        String str = this.A09;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        String str2 = this.A05;
        boolean z = this.A0A;
        String str3 = this.A07;
        String str4 = this.A08;
        Long l = this.A04;
        String str5 = this.A06;
        Integer num = this.A03;
        DbU.A0w(fragmentActivity, C51973G9u.A0A(userSession, C46548Dgp.A02(userSession, str, "notes_action_sheet", str2)), userSession, ModalActivity.class, "profile");
        if (!z || l == null) {
            C3018660j.A01(userSession).A0B(C69506Nmo.A0G);
            return;
        }
        String obj = l.toString();
        0qQ.A0B(obj, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_mention_click_client");
        Long A002 = GPJ.A00(userSession, obj);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            A0e.AAJ("container_module", str2);
            A0e.A9F("carousel_index", DbZ.A0c(num));
            C51973G9u.A14(A0e, "carousel_media_id", str5);
            A0e.AAJ("inventory_source", str3);
            A0e.AAJ("ranking_info_token", str4);
            A0e.Cgf();
        }
    }
}
