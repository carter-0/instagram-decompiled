package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.2x9  reason: invalid class name and case insensitive filesystem */
public final class C234132x9 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234132x9(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        String Avj;
        FragmentActivity activity;
        String str2;
        String id;
        AnonymousClass3W1 BQr;
        int A03 = AnonymousClass0fD.A03(-1009119122);
        C240213Ka r8 = (C240213Ka) obj;
        int A032 = AnonymousClass0fD.A03(-315405590);
        0qQ.A0B(r8, 0);
        1Xj r5 = r8.A01;
        C234042wt r7 = this.A00;
        UserSession userSession = r7.A0B;
        1Xj A1e = r5.A1e(userSession);
        Product product = r8.A02;
        if (0qQ.A0K(r8.A03, true)) {
            FragmentActivity activity2 = r7.A07.getActivity();
            if (activity2 == null) {
                i = -1322198266;
            } else {
                C231292rN r0 = r7.A00;
                if (r0 == null || (BQr = r0.BQr(A1e)) == null) {
                    i = -1966069916;
                } else {
                    AnonymousClass4DU r1 = r7.A0S;
                    W3r.A0C(userSession, r5, r1, r7.A05, false);
                    UserSession userSession2 = userSession;
                    C249713kF.A00.A0s(activity2, userSession2, r5, r1, BQr, (C262944Gp) null, (XCE) null, r7.A05, "shopping_indicator");
                    C17073VGv.A00(userSession).A00();
                    i = -888430017;
                }
            }
        } else {
            Fragment fragment = r7.A07;
            I6Q.A00(fragment, userSession, A1e);
            I6Q.A05(r5, r7.A00, C301155ye.A00(), r7.A02, C233162v9.PRODUCT_TAG_CLICK);
            String str3 = r7.A05;
            if (str3 == null) {
                str3 = r8.A05;
            }
            boolean CcK = A1e.CcK();
            AnonymousClass4DU r11 = r7.A0S;
            if (CcK) {
                C18694Vws.A01(userSession, r5, A1e, r11, product);
                AnonymousClass57Q r13 = r7.A01;
                if (!(r13 == null || !r13.A08(r5, false) || (id = r5.getId()) == null)) {
                    AnonymousClass57Q.A01(r13, id, true);
                }
            } else {
                W3r.A08(userSession, r5, r11, product, str3, r8.A04);
            }
            C17073VGv.A00(userSession).A00();
            FragmentActivity activity3 = fragment.getActivity();
            if (activity3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("trying to navigate to fragment from host: ");
                Object host = fragment.getHost();
                if (host != null) {
                    str2 = String.valueOf(host);
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                sb.append(" ProductTagClickEvent from class: ");
                sb.append(fragment.getClass());
                sb.append(" on null activity");
                0wb.A03("MediaLinkBroadcastHandler", sb.toString());
                i = -1183962991;
            } else if (fragment.getHost() == null || (!activity3.isFinishing() && ((activity = fragment.getActivity()) == null || !activity.isDestroyed()))) {
                FragmentActivity activity4 = fragment.getActivity();
                if (activity4 != null) {
                    WNN A0L = C249713kF.A00.A0L(activity4, userSession, r11, product, "tags", str3);
                    AndroidLink androidLink = (AndroidLink) 00k.A0J(r5.A3P());
                    if (androidLink == null || (Avj = androidLink.Avj()) == null) {
                        str = null;
                    } else {
                        Uri A033 = 0cp.A03(Avj);
                        0qQ.A07(A033);
                        str = A033.getQueryParameter(C273654mx.A00(45));
                    }
                    A0L.A02(A1e, Integer.valueOf(r5.A15(userSession)));
                    A0L.A0b = true;
                    A0L.A08 = null;
                    A0L.A0X = A1e.CcK();
                    A0L.A0a = true;
                    A0L.A0N = r7.A04;
                    A0L.A09 = r5.A25();
                    A0L.A0M = str;
                    User A2A = A1e.A2A(userSession);
                    if (A2A != null) {
                        A0L.A0F = A2A.getId();
                    }
                    if (!A1e.A5j()) {
                        A0L.A05 = C55150Hcy.A00(A1e, product, r8.A00);
                    }
                    WNN.A01(A0L);
                }
                i = -888430017;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("trying to navigate to fragment from host: ");
                sb2.append(fragment.getHost());
                sb2.append(" ProductTagClickEvent from class: ");
                sb2.append(fragment.getClass());
                sb2.append(" after activity finished");
                0wb.A03("MediaLinkBroadcastHandler", sb2.toString());
                i = -296899107;
            }
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1306719397, A03);
    }
}
