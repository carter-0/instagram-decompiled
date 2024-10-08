package X;

import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.Iterator;

/* renamed from: X.Ulg  reason: case insensitive filesystem */
public final class C15964Ulg extends C324596za {
    public final int A00;
    public final C16672Uz8 A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ C15381Ube A04;

    public C15964Ulg(C16672Uz8 uz8, C15381Ube ube, int i, boolean z, boolean z2) {
        this.A04 = ube;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = uz8;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Dialog dialog;
        Uri uri;
        int A032 = AnonymousClass0fD.A03(1764358452);
        UY7 uy7 = (UY7) obj;
        int A033 = AnonymousClass0fD.A03(1383191025);
        0qQ.A0B(uy7, 0);
        C15381Ube ube = this.A04;
        AnonymousClass0eM r1 = ube.A0i;
        C17694VcP A012 = C18211Vnb.A01(AnonymousClass7TE.A0l(r1), uy7);
        C16672Uz8 uz8 = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A02;
        C17579VaX vaX = A012.A02;
        C309546Yr r4 = ube.A0a;
        C15381Ube.A00(ube);
        if (r4.A02 || (((dialog = r4.A00) != null && dialog.isShowing()) || vaX == null)) {
            C15381Ube.A02(uz8, A012, ube, z, z2);
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            FragmentActivity requireActivity = ube.requireActivity();
            Hashtag hashtag = C15381Ube.A01(ube).A01;
            HAI hai = ube.A08;
            if (hai != null) {
                long A002 = (long) hai.A01.A00(hai.A00);
                HAI hai2 = ube.A08;
                if (hai2 != null) {
                    String obj2 = hai2.A00.toString();
                    C15381Ube ube2 = ube;
                    C19342WVj wVj = new C19342WVj(uz8, A012, ube2, z, z2);
                    String str = vaX.A04;
                    VZP vzp = null;
                    if (!TextUtils.isEmpty(str)) {
                        uri = 0cp.A03(str);
                    } else {
                        uri = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = vaX.A05.iterator();
                    while (it.hasNext()) {
                        sb.append(AnonymousClass7TE.A18(it));
                        sb.append(" ");
                    }
                    String str2 = vaX.A02;
                    Boolean bool = r4.A01;
                    if (bool == null) {
                        bool = false;
                        r4.A01 = bool;
                    }
                    if (bool.booleanValue()) {
                        vzp = new VZP(ube2, A0l, hashtag, vaX.A00, obj2, A002);
                    }
                    String str3 = vaX.A03;
                    C309546Yr r20 = r4;
                    String str4 = str3;
                    C15381Ube ube3 = ube;
                    C309546Yr.A00(requireActivity, uri, ube3, A0l, wVj, r20, vzp, ube2, str4, sb.toString(), vaX.A01, str2, vaX.A00, hashtag.getName());
                }
            }
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(-12702448, A033);
        AnonymousClass0fD.A0A(161991418, A032);
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(-668431276);
        C14227TsA tsA = this.A04.A06;
        if (tsA == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        C14227TsA.A00(tsA);
        AnonymousClass0fD.A0A(-1187823911, A032);
    }

    public final void onFailInBackground(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(1092909598);
        C15381Ube ube = this.A04;
        ube.A0Y.post(new C20221WnL(this, ube));
        AnonymousClass0fD.A0A(1592525146, A032);
    }

    public final void onFinish() {
        long j;
        String str;
        Long A10;
        int A032 = AnonymousClass0fD.A03(890192838);
        if (this.A03) {
            C15381Ube ube = this.A04;
            String id = C15381Ube.A01(ube).A01.getId();
            UserSession A0l = AnonymousClass7TE.A0l(ube.A0i);
            if (id == null || (A10 = AnonymousClass7TE.A10(id)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C54689HOu hOu = ube.A00;
            C320506sU r6 = ube.A03;
            if (r6 == null) {
                str = "pivotPageSessionProvider";
            } else {
                0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(ube, A0l, 0), "instagram_organic_hashtag_page_impression");
                if (A0e.isSampled()) {
                    A0e.AAJ("containermodule", ube.A0f);
                    A0e.A9F(Pxd.A00(81), Long.valueOf(j));
                    A0e.A8M(hOu, AnonymousClass000.A00(238));
                    DbY.A1C(A0e);
                    A0e.A9F(AnonymousClass000.A00(3466), C51971G9r.A0m());
                    A0e.A9F("hashtag_id", DbZ.A0d(id));
                    A0e.A8M(r6.A02, AnonymousClass000.A00(1685));
                    A0e.AAJ(AnonymousClass000.A00(1686), r6.getSessionId());
                    A0e.Cgf();
                }
                C14074TpO tpO = ube.A07;
                if (tpO == null) {
                    str = "grid";
                } else {
                    C14074TpO.A00(tpO, false, true);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(-1242141832, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1887771531);
        C15381Ube ube = this.A04;
        C18806W2y.A04(ube.A0c, AnonymousClass000.A00(2266), this.A00);
        if (this.A03) {
            C321676uZ r0 = ube.A02;
            if (r0 != null) {
                r0.A00.A04();
                C321676uZ r02 = ube.A02;
                if (r02 != null) {
                    r02.D3T();
                }
            }
            0qQ.A0F("gridPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(518642677, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(410536862);
        UY7 uy7 = (UY7) obj;
        int A0D = AnonymousClass7TG.A0D(uy7, -335178715);
        C15381Ube ube = this.A04;
        C17694VcP A012 = C18211Vnb.A01(AnonymousClass7TE.A0l(ube.A0i), uy7);
        C16672Uz8 uz8 = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (z && z2) {
            uz8 = A012.A01;
            0qQ.A0A(uz8);
        }
        ube.A0Y.post(new C20324WpL(uz8, A012, this, ube));
        AnonymousClass0fD.A0A(624931249, A0D);
        AnonymousClass0fD.A0A(740011634, A032);
    }
}
