package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.H4g  reason: case insensitive filesystem */
public final class C54237H4g extends 1P0 {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C247733gp A05;
    public final 1Xj A06;
    public final AnonymousClass4DU A07;
    public final WeakReference A08;
    public final WeakReference A09 = C51965G9l.A0v((Object) null);
    public final int A0A;
    public final int A0B;
    public final boolean A0C;

    public C54237H4g(Activity activity, Context context, AnonymousClass4DH r5, C59607JQb jQb, UserSession userSession, C247733gp r8, 1Xj r9, AnonymousClass4DU r10, int i, int i2, int i3, boolean z) {
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = C51965G9l.A0v(jQb);
        this.A04 = userSession;
        this.A02 = context;
        this.A01 = activity;
        this.A03 = r5;
        this.A07 = r10;
        this.A0C = z;
        this.A0A = i;
        this.A00 = i2;
        this.A0B = i3;
    }

    public final void onFail(C268654dm r18) {
        C247733gp r9;
        String str;
        String str2;
        C268654dm r3 = r18;
        int A032 = AnonymousClass0fD.A03(538445233);
        0qQ.A0B(r3, 0);
        boolean z = r3 instanceof C268674do;
        if (!z) {
            r9 = this.A05;
            r9.A06 = C252883pr.RetryWhenNetworkAvailable;
            C225942fB.A00(this.A04).A0L(new C56538I0n(r9, this.A07.getModuleName(), C61970qY.A09(this.A02), this.A0A, this.A00, this.A0B, this.A0C, false));
        } else {
            C54071Gyu gyu = (C54071Gyu) ((C268674do) r3).A00;
            r9 = this.A05;
            r9.A06 = C252883pr.Failure;
            String str3 = gyu.A04;
            if (str3 != null) {
                r9.A0C = str3;
            }
            C54991HaO.A00(gyu.A05);
            r9.A0M = gyu.A06;
            r9.A09 = C54992HaP.A00(gyu.A03);
        }
        this.A06.A0d.A01();
        C54071Gyu gyu2 = (C54071Gyu) r3.A00();
        0Ym r7 = new 0Ym();
        if (gyu2 != null) {
            str = Integer.valueOf(gyu2.mStatusCode).toString();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        r7.put(TraceFieldType.ErrorCode, str);
        if (gyu2 == null || (str2 = gyu2.A02) == null || str2.length() == 0) {
            str2 = "comment_client_error";
        }
        r7.put("error_key", str2);
        if (!(gyu2 == null || gyu2.getErrorMessage() == null)) {
            str4 = gyu2.getErrorMessage();
        }
        r7.put("error_message", str4);
        r7.put("m_pk", r9.A0E);
        0Ym A0N = 0se.A0N(r7);
        C59607JQb jQb = (C59607JQb) this.A08.get();
        if (jQb != null) {
            if (!z) {
                C61970qY.A0E(this.A02);
            } else if (((C54071Gyu) ((C268674do) r3).A00).A07) {
                jQb.DYQ();
            }
            jQb.DYR(r9, A0N);
        }
        ((C64901Yc) HWC.A00()).A00 = new ODK("latest_comment_posting_error", A0N);
        AnonymousClass0fD.A0A(833662864, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ProductType A1v;
        int A032 = AnonymousClass0fD.A03(1881409896);
        C54071Gyu gyu = (C54071Gyu) obj;
        int A033 = AnonymousClass0fD.A03(2110177887);
        0qQ.A0B(gyu, 0);
        C247733gp r8 = this.A05;
        C252883pr r10 = r8.A06;
        String str = r8.A0G;
        1bK r0 = gyu.A00;
        if (r0 != null) {
            C247733gp r2 = new C247733gp(r0);
            r8.A03 = r2.A03;
            r8.A06 = C252883pr.Success;
            String str2 = r2.A0G;
            0qQ.A0B(str2, 0);
            r8.A0G = str2;
            r8.A0J = r2.A0J;
            r8.A0D = r2.A0D;
            List list = r2.A0K;
            0qQ.A0B(list, 0);
            r8.A0K = list;
            r8.A0J = r2.A0J;
            1Xj r7 = this.A06;
            1i5 r11 = r7.A0d;
            1i7 r02 = r11.A0B;
            String str3 = r2.A0G;
            0qQ.A0B(str3, 1);
            Set set = r02.A02;
            if (set.contains(r8.A0G)) {
                set.remove(r8.A0G);
                r8.A0G = str3;
                set.add(str3);
            }
            r8.A0I = r2.A0I;
            r7.A0C.ESK(Integer.valueOf(r7.A0r() + 1));
            r11.A01();
            if (r10 == C252883pr.DeletePending) {
                C59608JQc jQc = (C59608JQc) this.A09.get();
                UserSession userSession = this.A04;
                String moduleName = this.A07.getModuleName();
                0qQ.A0B(userSession, 3);
                HashSet hashSet = new HashSet(1);
                hashSet.add(r8);
                I7G.A06(jQc, userSession, r7, hashSet);
                String valueOf = String.valueOf(moduleName);
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0K("media/%s/comment/%s/delete/", new Object[]{r8.A0E, r8.A0G});
                A0a.A0Q(C54049GyY.class, C56208Hub.class);
                A0a.A9m("comment_id", r8.A0G);
                C51968G9o.A1L(A0a, "media_id", r8.A0E, valueOf);
                1OC A0U = DbT.A0U(A0a, true);
                A0U.A00 = new H4N(1, jQc, hashSet, userSession, r7);
                1ES.A03(A0U);
            }
            C59607JQb jQb = (C59607JQb) this.A08.get();
            if (jQb != null) {
                jQb.DYT(r8, str);
            }
            User A11 = C51966G9m.A11(r7);
            if (!(A11 == null || !r8.A0p || (A1v = r7.A1v()) == null)) {
                C273004lm A002 = C272994ll.A00(this.A04);
                String id = A11.getId();
                String str4 = r8.A0E;
                String name = r7.BR7().name();
                String str5 = A1v.A00;
                0qQ.A07(str5);
                A002.A0B(id, str4, name, str5);
            }
            ProductType A1v2 = r7.A1v();
            if (r2.A0q && (A1v2 == ProductType.CLIPS || A1v2 == ProductType.FEED)) {
                UserSession userSession2 = this.A04;
                if (182.A06(0Tu.A05, userSession2, 36318316469426255L) && C51966G9m.A11(r7) != null && this.A01 != null && !this.A03.mDetached) {
                    C57277IVm iVm = new C57277IVm(2, C54669HOa.CREATOR_RESHARE_NUDGE, EZb.COMMENTS, r7.A1v(), this, DbW.A0J(userSession2, "PostCommentUtil"));
                    C310336ap A0W = DbV.A0W();
                    Context context = this.A02;
                    DbS.A19(context, A0W, 2131952402);
                    User A112 = C51966G9m.A11(r7);
                    if (A112 != null) {
                        A0W.A0I = DbY.A0b(context, A112, 2131952403);
                        C51970G9q.A1L(r7, A0W);
                        DbW.A0q(context, A0W, 2131952401);
                        A0W.A01 = 5000;
                        A0W.A0A(iVm);
                        A0W.A0L = true;
                        1xC r6 = 1xC.A01;
                        Dc2 A003 = A0W.A00();
                        0qQ.A0C(A003, AnonymousClass000.A00(3666));
                        r6.A00(new AnonymousClass3GP(A003));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            String str6 = gyu.A01;
            if (str6 != null) {
                UserSession userSession3 = this.A04;
                0sn A004 = AnonymousClass8OY.A00(userSession3).A00(str6);
                if (A004 == null) {
                    A004 = 0sn.A00;
                }
                List list2 = r2.A0K;
                1as.A04.A0G(userSession3, "COMMENT", list2, A004);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        User A0k = DbT.A0k(it);
                        if (AnonymousClass8OY.A01(userSession3) || A004.contains(A0k.getUsername())) {
                            1as.A04.A09(userSession3, r2, new DirectShareTarget(A0k));
                        }
                    }
                }
            }
            AnonymousClass0fD.A0A(-1814967954, A033);
            AnonymousClass0fD.A0A(-1358022470, A032);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1285301556);
        this.A08.get();
        AnonymousClass0fD.A0A(32152, A032);
    }
}
