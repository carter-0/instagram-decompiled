package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OdQ  reason: case insensitive filesystem */
public abstract class C71127OdQ {
    public static final C242553Us A00(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        C242553Us r1 = new C242553Us();
        float A0B = (float) AnonymousClass7TE.A0B(igImageView.getResources());
        r1.A07(A0B, A0B, A0B, A0B);
        return r1;
    }

    public static final N3F A01(UserSession userSession, N3F n3f, String str) {
        String str2;
        int A0M;
        Integer valueOf;
        boolean z;
        Integer valueOf2;
        0qQ.A0B(n3f, 0);
        boolean A1Y = DbW.A1Y(str);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap hashMap = n3f.A08;
        if (hashMap != null) {
            A1E.putAll(hashMap);
        }
        String str3 = n3f.A07;
        OKH okh = (OKH) userSession.A01(OKH.class, new C41655Ay7(userSession, 20));
        String str4 = n3f.A05;
        if (str4 != null) {
            str2 = okh.A00(str4, str, str3);
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str3, str2)) {
            return n3f;
        }
        if (str2 == null || str3 != null) {
            if (str2 == null) {
                if (str3 != null) {
                    Object obj = A1E.get(str3);
                    if (obj != null) {
                        A0M = AnonymousClass7TE.A0M(obj);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                z = false;
            } else {
                if (str3 != null) {
                    Number A0z = JTO.A0z(str2, A1E);
                    Object obj2 = A1E.get(str3);
                    if (obj2 != null) {
                        A0M = AnonymousClass7TE.A0M(obj2);
                        if (A0z == null) {
                            valueOf = Integer.valueOf(A1Y ? 1 : 0);
                        } else {
                            valueOf = Integer.valueOf(A0z.intValue() + 1);
                        }
                        A1E.put(str2, valueOf);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                z = false;
            }
            if (A0M == A1Y) {
                A1E.remove(str3);
            } else {
                C66581MXm.A1S(str3, A1E, A0M - A1Y);
            }
            z = false;
        } else {
            Number A0z2 = JTO.A0z(str2, A1E);
            if (A0z2 == null) {
                valueOf2 = Integer.valueOf(A1Y);
            } else {
                valueOf2 = Integer.valueOf(A0z2.intValue() + 1);
            }
            A1E.put(str2, valueOf2);
            z = true;
        }
        N37 n37 = n3f.A00;
        C300925yB r2 = n3f.A01;
        String str5 = n3f.A06;
        return new N3F(n37, r2, n3f.A02, n3f.A04, n3f.A03, str4, str5, str2, A1E, n3f.A0B, n3f.A0A, z);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Xx, java.lang.Object] */
    public static final C71039Oa5 A02(N37 n37, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList;
        1iA r0;
        String str5;
        long j;
        N37 n372 = n37;
        C68156N2w n2w = n372.A00;
        if (n2w != null) {
            ? obj = new Object();
            String str6 = str;
            obj.A5j = str6;
            obj.EZf(n372.A01);
            List<C68157N2x> list = n372.A08;
            Float f = null;
            if (list != null) {
                arrayList = AnonymousClass7TG.A0r(list);
                for (C68157N2x n2x : list) {
                    0qQ.A0B(n2x, 0);
                    arrayList.add(new VideoVersion((DirectMediaFallbackUrl) null, n2x.A01, n2x.A02, n2x.A03, (Long) null, n2x.A05, n2x.A06));
                }
            } else {
                arrayList = null;
            }
            obj.EqT(arrayList);
            Integer num3 = n2w.A00;
            obj.A4n = num3;
            Integer num4 = n2w.A02;
            obj.A4o = num4;
            obj.A56 = n2w.A03;
            if (list == null || !AnonymousClass7TE.A1b(list)) {
                r0 = 1iA.A0Q;
            } else {
                r0 = 1iA.A0a;
            }
            obj.A4m = Integer.valueOf(r0.A00);
            Integer num5 = n372.A05;
            if (num5 != null) {
                f = Float.valueOf((float) num5.intValue());
            }
            obj.A4P = f;
            obj.A6M = n372.A07;
            obj.A4j = n372.A03;
            if (user != null) {
                str5 = user.getId();
            } else {
                User user2 = n372.A02;
                if (user2 != null) {
                    str5 = user2.getId();
                } else {
                    str5 = "";
                }
            }
            String str7 = n2w.A06;
            if (str7 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (num4 != null) {
                int intValue = num4.intValue();
                if (num3 != null) {
                    ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str7, intValue, num3.intValue());
                    if (num != null) {
                        j = TimeUnit.SECONDS.toMicros((long) num.intValue());
                    } else {
                        j = 0;
                    }
                    AtomicBoolean atomicBoolean = 1Xj.A0i;
                    return new C71039Oa5(new OIP(extendedImageUrl, 1Xv.A02(obj), false, str6, str5, str7, str2, (String) null, (String) null, str3, str4, DbX.A01(num2), j, true, false, z, z2, z3, z4));
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Xx, java.lang.Object] */
    public static final C71039Oa5 A03(ImageUrl imageUrl, User user, Integer num, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str3;
        long j;
        0qQ.A0B(imageUrl, 1);
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(imageUrl);
        ? obj = new Object();
        String str4 = str;
        obj.A5j = str4;
        obj.EZf(new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, AnonymousClass7TE.A1I(extendedImageUrl), (List) null));
        obj.A4n = Integer.valueOf(i2);
        obj.A4o = Integer.valueOf(i);
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = "";
        }
        String url = imageUrl.getUrl();
        if (num != null) {
            j = TimeUnit.SECONDS.toMicros((long) num.intValue());
        } else {
            j = 0;
        }
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return new C71039Oa5(new OIP(extendedImageUrl, 1Xv.A02(obj), false, str4, str3, url, (String) null, (String) null, (String) null, str2, (String) null, 0, j, true, false, false, z, z2, z3));
    }

    public static final C367618rI A04(Context context, Boolean bool, Integer num, C62320sa r17, int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        String A16 = AnonymousClass7TE.A16(context, i);
        int i3 = i2;
        if (bool.equals(false)) {
            drawable = context.getDrawable(i3);
        } else {
            drawable = null;
        }
        if (bool.equals(true)) {
            drawable2 = context.getDrawable(i3);
        } else {
            drawable2 = null;
        }
        return new C367618rI(drawable2, drawable, (C15048ULb) null, new PHN(r17, 0), num, A16, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public static final void A06(Activity activity, 1iA r6, C62320sa r7) {
        int i = 2131958908;
        int i2 = 2131958907;
        if (r6 == 1iA.A0a) {
            i = 2131958910;
            i2 = 2131958909;
        }
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(i);
        A0X.A08(i2);
        A0X.A0K(C71249OgE.A00(r7, 32), 2131958900);
        A0X.A0C(C71211Ofc.A00);
        AnonymousClass7TH.A0a(A0X, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r3.equals("shared_stack") == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r6 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r3.equals("roll_call") == false) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A05(android.content.Context r14, com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r6 = r18
            if (r18 == 0) goto L_0x0019
            if (r22 == 0) goto L_0x0019
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r2 = 0
            X.NkG r3 = X.C69376NkG.A08
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r1 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r5 = r2
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
        L_0x0019:
            java.lang.String r1 = r15.A06
            r2 = r16
            boolean r4 = X.0qQ.A0K(r2, r1)
            r2 = r17
            boolean r6 = X.0qQ.A0K(r2, r1)
            if (r21 == 0) goto L_0x0045
            java.lang.Integer r10 = X.AnonymousClass05K.A0d
            r1 = 2131960077(0x7f13210d, float:1.9556812E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r14, r1)
            r1 = 2131237910(0x7f081c16, float:1.8092084E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            X.NkG r9 = X.C69376NkG.A09
            r8 = 0
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r7 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r13 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.add(r7)
        L_0x0045:
            r2 = r6
            r3 = r19
            if (r19 == 0) goto L_0x0051
            int r1 = r3.hashCode()
            switch(r1) {
                case -1782234803: goto L_0x00a3;
                case -697290194: goto L_0x00a6;
                case 348943746: goto L_0x00af;
                case 531959920: goto L_0x00b2;
                case 535918816: goto L_0x00c2;
                default: goto L_0x0051;
            }
        L_0x0051:
            r2 = 0
        L_0x0052:
            java.lang.String r5 = "shared_stack"
            if (r2 == 0) goto L_0x0074
            if (r6 == 0) goto L_0x0099
            r1 = 2131960643(0x7f132343, float:1.955796E38)
            java.lang.String r4 = r14.getString(r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
        L_0x0061:
            boolean r1 = X.0qQ.A0K(r3, r5)
            if (r1 == 0) goto L_0x006e
            r1 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r4 = r14.getString(r1)
        L_0x006e:
            r1 = 2131238196(0x7f081d34, float:1.8092664E38)
            X.C66583MXo.A1M(r2, r4, r0, r1)
        L_0x0074:
            if (r6 != 0) goto L_0x0098
            boolean r1 = X.0qQ.A0K(r3, r5)
            if (r1 == 0) goto L_0x0089
            X.0Tu r3 = X.0Tu.A05
            r1 = 36316448161796484(0x81059e00301184, double:3.030006279894683E-306)
            boolean r1 = X.182.A06(r3, r15, r1)
            if (r1 == 0) goto L_0x0098
        L_0x0089:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r1 = 2131960226(0x7f1321a2, float:1.9557115E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r14, r1)
            r1 = 2131238715(0x7f081f3b, float:1.8093717E38)
            X.C66583MXo.A1M(r3, r2, r0, r1)
        L_0x0098:
            return r0
        L_0x0099:
            r1 = 2131971974(0x7f134f86, float:1.9580942E38)
            java.lang.String r4 = r14.getString(r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            goto L_0x0061
        L_0x00a3:
            java.lang.String r1 = "questions"
            goto L_0x00b4
        L_0x00a6:
            java.lang.String r1 = "shared_stack"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00c0
            goto L_0x0051
        L_0x00af:
            java.lang.String r1 = "add_yours"
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r1 = "challenges"
        L_0x00b4:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0051
            if (r4 != 0) goto L_0x00c0
            if (r20 != 0) goto L_0x00c0
            if (r6 == 0) goto L_0x0051
        L_0x00c0:
            r2 = 1
            goto L_0x0052
        L_0x00c2:
            java.lang.String r1 = "roll_call"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0052
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71127OdQ.A05(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):java.util.ArrayList");
    }
}
