package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.KGy  reason: case insensitive filesystem */
public final class C61674KGy extends 2Cn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass07Z A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ 1Xj A06;
    public final /* synthetic */ AnonymousClass6ST A07;
    public final /* synthetic */ Integer A08;

    public C61674KGy(Context context, FragmentActivity fragmentActivity, 0hq r3, AnonymousClass07Z r4, AnonymousClass0iw r5, UserSession userSession, 1Xj r7, AnonymousClass6ST r8, Integer num) {
        this.A07 = r8;
        this.A00 = context;
        this.A06 = r7;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = num;
    }

    public final void onFinish() {
        this.A07.hide();
    }

    public final void onStart() {
        AnonymousClass6ST r2 = this.A07;
        DbU.A18(this.A00, r2, 2131965491);
        AnonymousClass0fN.A00(r2);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C309516Yo A0M;
        String str;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            1Xj r5 = this.A06;
            if (r5.A5p()) {
                FragmentActivity fragmentActivity = this.A01;
                Context context = this.A00;
                UserSession userSession = this.A05;
                0hq r9 = this.A02;
                AnonymousClass07Z r3 = this.A03;
                AnonymousClass0iw r10 = this.A04;
                Integer num = this.A08;
                r9.A0v(new LZX(context, fragmentActivity, r9, r10, userSession), r3, AnonymousClass000.A00(144));
                K5Q A002 = LKV.A00(num, canonicalPath, r5.A30());
                A0M = DbS.A0M(fragmentActivity, userSession);
                A0M.A09();
                A0M.A0D(A002);
                str = "cutout_photo_post_creation_flow";
            } else if (r5.CeS()) {
                FragmentActivity fragmentActivity2 = this.A01;
                Context context2 = this.A00;
                UserSession userSession2 = this.A05;
                0hq r8 = this.A02;
                AnonymousClass07Z r32 = this.A03;
                AnonymousClass0iw r92 = this.A04;
                Integer num2 = this.A08;
                r8.A0v(new LZX(context2, fragmentActivity2, r8, r92, userSession2), r32, AnonymousClass000.A00(144));
                0qQ.A0B(num2, 1);
                K5S A003 = C63129Krx.A00(num2, canonicalPath, false);
                A0M = DbS.A0M(fragmentActivity2, userSession2);
                A0M.A09();
                A0M.A0D(A003);
                str = "cutout_video_post_creation_flow";
            } else {
                return;
            }
            A0M.A0A = str;
            A0M.A04();
        } catch (IOException e) {
            0kD.A07(AnonymousClass000.A00(4041), "Error getting image file path", e);
        }
    }
}
