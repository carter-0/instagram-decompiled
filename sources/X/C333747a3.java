package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7a3  reason: invalid class name and case insensitive filesystem */
public final class C333747a3 {
    public static final List A0H = 0sr.A1P(new String[]{"❤️", "🙌", "🔥", "👏", "😢", "😍", "😮", "😂"});
    public final C333737a2 A00;
    public final UserSession A01;
    public final 05G A02;
    public final 05G A03 = new 02z("");
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final Map A0G;

    public C333747a3(C333737a2 r8, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r8, 2);
        this.A01 = userSession;
        this.A00 = r8;
        02z r0 = new 02z("");
        this.A02 = r0;
        this.A0A = 10b.A03(r0);
        02z r02 = new 02z(false);
        this.A07 = r02;
        this.A0E = 10b.A03(r02);
        this.A09 = new 02z(new AnonymousClass7a4((LruCache) null, (List) null, (List) null, (DefaultConstructorMarker) null, 7));
        02z A012 = 106.A01(A0H);
        this.A04 = A012;
        this.A0B = 10b.A03(A012);
        02z A013 = 106.A01((Object) null);
        this.A06 = A013;
        this.A0D = 10b.A03(A013);
        02z A014 = 106.A01((Object) null);
        this.A05 = A014;
        this.A0C = 10b.A03(A014);
        02z A015 = 106.A01((Object) null);
        this.A08 = A015;
        this.A0F = 10b.A03(A015);
        this.A0G = new LinkedHashMap();
    }

    public final C335377cr A00(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0G;
        if (map.containsKey(str)) {
            return (C335377cr) map.get(str);
        }
        C335377cr r0 = (C335377cr) this.A0D.getValue();
        if (r0 == null) {
            return r0;
        }
        map.put(str, r0);
        return r0;
    }

    public final void A04(String str) {
        String str2;
        0qQ.A0B(str, 0);
        C335377cr r1 = (C335377cr) this.A0D.getValue();
        AnonymousClass7a4 r6 = (AnonymousClass7a4) this.A09.getValue();
        C333737a2 r5 = this.A00;
        String str3 = null;
        if (r1 != null) {
            str3 = r1.A02;
            str2 = r1.A04;
        } else {
            str2 = null;
        }
        CharSequence charSequence = (CharSequence) this.A03.getValue();
        0qQ.A0B(charSequence, 3);
        r5.A00.put(str, new AnonymousClass9JD(r6, charSequence, str3, str2));
    }

    public final void A01() {
        this.A06.Epw((Object) null);
        this.A05.Epw((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r3 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r2 = new X.C335397ct(r6, r1, r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3.Epw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.user.model.User r6, X.C335737dS r7) {
        /*
            r5 = this;
            X.0Ud r0 = r5.A0D
            java.lang.Object r0 = r0.getValue()
            X.7cr r0 = (X.C335377cr) r0
            r4 = 1
            if (r0 == 0) goto L_0x000e
            r4 = 0
            com.instagram.user.model.User r6 = r0.A00
        L_0x000e:
            if (r6 == 0) goto L_0x0063
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0029;
                case 2: goto L_0x0029;
                case 3: goto L_0x0051;
                case 4: goto L_0x004b;
                case 5: goto L_0x0029;
                case 6: goto L_0x0029;
                case 7: goto L_0x0029;
                case 8: goto L_0x0029;
                case 9: goto L_0x0029;
                case 10: goto L_0x0055;
                case 11: goto L_0x004b;
                case 12: goto L_0x0045;
                case 13: goto L_0x0045;
                case 14: goto L_0x001d;
                case 15: goto L_0x0029;
                default: goto L_0x0017;
            }
        L_0x0017:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x001d:
            X.05G r3 = r5.A05
            r1 = 2131964926(0x7f1333fe, float:1.9566647E38)
            r0 = 0
            X.7ct r2 = new X.7ct
            r2.<init>(r6, r1, r0, r0)
            goto L_0x0060
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Type "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " cannot be handled here"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x0045:
            X.05G r3 = r5.A05
            r1 = 2131964929(0x7f133401, float:1.9566654E38)
            goto L_0x005a
        L_0x004b:
            X.05G r3 = r5.A05
            r1 = 2131964928(0x7f133400, float:1.9566651E38)
            goto L_0x005a
        L_0x0051:
            r1 = 2131964927(0x7f1333ff, float:1.956665E38)
            goto L_0x0058
        L_0x0055:
            r1 = 2131964930(0x7f133402, float:1.9566656E38)
        L_0x0058:
            X.05G r3 = r5.A05
        L_0x005a:
            r0 = 1
            X.7ct r2 = new X.7ct
            r2.<init>(r6, r1, r4, r0)
        L_0x0060:
            r3.Epw(r2)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333747a3.A02(com.instagram.user.model.User, X.7dS):void");
    }

    public final void A03(User user, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A06.Epw(new C335377cr(user, l, str, str2, str3, z, z2, z3));
    }
}
