package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.maps.model.LatLng;
import com.facebook.location.platform.api.Location;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdT  reason: case insensitive filesystem */
public abstract class C71130OdT {
    public static final N4t A02(N3Q n3q) {
        N3Q n3q2 = n3q;
        0qQ.A0B(n3q2, 0);
        String str = n3q2.A09;
        LatLng latLng = n3q2.A02;
        AnonymousClass4AB r17 = n3q2.A03;
        User user = n3q2.A04;
        long j = n3q2.A01;
        String str2 = n3q2.A08;
        boolean z = n3q2.A0D;
        boolean z2 = n3q2.A0E;
        boolean z3 = n3q2.A0F;
        boolean z4 = n3q2.A0A;
        int i = n3q2.A00;
        String str3 = n3q2.A07;
        boolean z5 = n3q2.A0B;
        boolean z6 = n3q2.A0C;
        boolean z7 = n3q2.A0G;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        String str4 = str3;
        String str5 = n3q2.A06;
        int i2 = i;
        long j2 = j;
        AnonymousClass4AB r18 = r17;
        return new N4t(latLng, r18, user, n3q2.A05, str, str2, str4, str5, i2, j2, z8, z9, z10, z11, false, z5, z6, z7, false, false);
    }

    public static final AnonymousClass4A6 A05(UserSession userSession, C42902Blw blw) {
        AnonymousClass4A5 r13;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ImmutableList optionalCompactedTreeListField;
        C42902Blw blw2 = blw;
        String obj = blw2.getRequiredEnumField(0, "last_active_location_audience", C69392NkW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE).toString();
        AnonymousClass4A5[] values = AnonymousClass4A5.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                r13 = AnonymousClass4A5.UNSET;
                break;
            }
            r13 = values[i4];
            if (0qQ.A0K(r13.A00, obj)) {
                break;
            }
            i4++;
        }
        long requiredIntField = (long) blw2.getRequiredIntField(1, "friend_map_last_seen_timestamp");
        C250663lr A04 = blw2.A04(C42897Blr.class, "allowlist", -24372901);
        if (A04 != null) {
            i = A04.getRequiredIntField(0, "num_users");
        } else {
            i = 0;
        }
        C250663lr optionalTreeField = blw2.getOptionalTreeField(3, AnonymousClass000.A00(2711), C42898Bls.class, 734045612);
        if (optionalTreeField != null) {
            i2 = optionalTreeField.getRequiredIntField(0, "num_users");
        } else {
            i2 = 0;
        }
        Class<C42901Blv> cls = C42901Blv.class;
        C250663lr optionalTreeField2 = blw2.getOptionalTreeField(4, "mutuals_checkup_info", cls, -147181074);
        if (optionalTreeField2 == null || (optionalCompactedTreeListField = optionalTreeField2.getOptionalCompactedTreeListField(0, "recent_mutual_users", C42900Blu.class, -1287974290)) == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TG.A0r(optionalCompactedTreeListField);
            Iterator it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                arrayList.add(((C43744C7o) C41845B3m.A0V(it).reinterpretRequired(0, C43744C7o.class, -508424204)).A0E(1E4.A00(userSession)));
            }
        }
        C250663lr optionalTreeField3 = blw2.getOptionalTreeField(4, "mutuals_checkup_info", cls, -147181074);
        if (optionalTreeField3 != null) {
            i3 = optionalTreeField3.getCoercedIntField(1, "other_mutuals_count");
        } else {
            i3 = 0;
        }
        ImmutableList optionalCompactedTreeListField2 = blw2.getOptionalCompactedTreeListField(5, "hidden_locations", C42899Blt.class, 312454470);
        if (optionalCompactedTreeListField2 != null) {
            arrayList2 = AnonymousClass7TE.A1C();
            Iterator it2 = optionalCompactedTreeListField2.iterator();
            while (it2.hasNext()) {
                C42881Blb blb = (C42881Blb) C41845B3m.A0V(it2).reinterpretRequired(0, C42881Blb.class, -1976689303);
                0qQ.A07(blb);
                C68150N2q A01 = A01(blb);
                if (A01 != null) {
                    arrayList2.add(A01);
                }
            }
        } else {
            arrayList2 = 0sn.A00;
        }
        return new AnonymousClass4A6(r13, arrayList, arrayList2, i, i2, i3, requiredIntField, false);
    }

    public static final List A06(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(A02((N3Q) it.next()));
        }
        return A0r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r4 != 4) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r1 != null) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4AB A00(X.C279864zZ r35, com.instagram.common.session.UserSession r36) {
        /*
            r24 = 0
            r5 = 1
            r3 = r35
            com.instagram.user.model.User r8 = r3.A0D
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = com.instagram.direct.inbox.notes.models.NoteStyle.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = (com.instagram.direct.inbox.notes.models.NoteStyle) r0
            if (r0 != 0) goto L_0x001d
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.UNKNOWN
        L_0x001d:
            int r4 = r0.ordinal()
            if (r4 == r5) goto L_0x00a7
            r0 = 2
            if (r4 == r0) goto L_0x00a1
            r1 = 5
            if (r4 == r1) goto L_0x00ad
            r0 = 7
            if (r4 == r0) goto L_0x009b
            r1 = 4
            if (r4 == r1) goto L_0x009b
        L_0x002f:
            r0 = r36
            java.lang.String r14 = X.AnonymousClass911.A01(r0, r8)
            X.5y2 r1 = r3.A0A
            r4 = 0
            if (r1 == 0) goto L_0x0095
            X.60C r0 = r1.A09
            if (r0 == 0) goto L_0x0095
            com.instagram.api.schemas.NotePogVideoDict r6 = r0.A01
        L_0x0040:
            X.60C r0 = r1.A09
            if (r0 == 0) goto L_0x0099
            com.instagram.api.schemas.NotePogImageDict r5 = r0.A00
        L_0x0046:
            java.util.List r0 = r3.A0N
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r0
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = r0.A02
        L_0x0052:
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r7 = X.AnonymousClass916.A00(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r24)
            X.4AB r3 = new X.4AB
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r15 = r4
            r16 = r4
            r18 = r2
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r24
            r36 = r24
            r17 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r3
        L_0x0093:
            r1 = r4
            goto L_0x0052
        L_0x0095:
            r6 = r4
            if (r1 == 0) goto L_0x0099
            goto L_0x0040
        L_0x0099:
            r5 = r4
            goto L_0x0046
        L_0x009b:
            X.9IJ r0 = new X.9IJ
            r0.<init>(r3, r1)
            goto L_0x00b2
        L_0x00a1:
            X.912 r0 = new X.912
            r0.<init>(r3)
            goto L_0x00b2
        L_0x00a7:
            X.91B r0 = new X.91B
            r0.<init>(r3)
            goto L_0x00b2
        L_0x00ad:
            X.9cz r0 = new X.9cz
            r0.<init>(r3, r5)
        L_0x00b2:
            r2.add(r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71130OdT.A00(X.4zZ, com.instagram.common.session.UserSession):X.4AB");
    }

    public static final C68150N2q A01(C42881Blb blb) {
        String A07 = blb.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A07 == null) {
            return null;
        }
        String A08 = blb.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A08 == null) {
            A08 = "";
        }
        return new C68150N2q(A07, A08, blb.getCoercedDoubleField(2, Location.LATITUDE), blb.getCoercedDoubleField(3, "longitude"), blb.getCoercedIntField(4, "radius"));
    }

    public static final N3Q A03(C53396GnT gnT, UserSession userSession) {
        C53370Gmu gmu;
        Integer num;
        C53396GnT gnT2 = gnT;
        int i = ((NoteAudience) gnT2.A01).A00;
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.WHITE;
        NoteFontStyle noteFontStyle = NoteFontStyle.STANDARD;
        C68176N3r n3r = (C68176N3r) gnT2.A02;
        UserSession userSession2 = userSession;
        C300845y2 A01 = AnonymousClass4A2.A01(userSession2, n3r, (String) null, (List) gnT2.A04);
        int i2 = ((NoteStyle) gnT2.A05).A00;
        String str = gnT2.A06;
        User A0j = DbT.A0j(userSession2);
        String str2 = userSession2.A06;
        List list = 0sn.A00;
        C279864zZ r9 = new C279864zZ((AnonymousClass60J) null, noteBackgroundColor, (NoteCustomThemeImpl) null, (C300865y4) null, noteFontStyle, (AnonymousClass60L) null, A01, (AnonymousClass60N) null, (User) null, A0j, false, -1, (String) null, "0", (String) null, str, str2, list, (List) null, list, i, i2, -1, -1, false, false, false, false);
        if (n3r == null || (gmu = n3r.A02) == null) {
            return null;
        }
        LatLng latLng = new LatLng((double) gmu.A00, (double) gmu.A01);
        AnonymousClass4AB A00 = A00(r9, userSession2);
        User A0Q = AnonymousClass7TF.A0Q(userSession2);
        long A0I = AnonymousClass7TG.A0I();
        boolean z = gnT2.A07;
        if (AnonymousClass7TF.A1Y(gmu.A03, true)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        return new N3Q(latLng, A00, A0Q, num, "CREATION_PIN_ID", "0", (String) null, (String) null, Integer.MAX_VALUE, A0I, false, false, false, true, false, false, z);
    }

    public static final N3Q A04(UserSession userSession, C71913Osv osv) {
        String str;
        AnonymousClass60E r0;
        C71913Osv osv2 = osv;
        C279864zZ r7 = osv2.A01;
        C300845y2 r02 = r7.A0A;
        if (r02 == null || (r0 = r02.A0A) == null || (str = r0.Bep()) == null) {
            str = "OPTIMISTIC_PRESENCE_ID";
        }
        String str2 = r7.A0H;
        C53370Gmu gmu = osv2.A00;
        LatLng latLng = new LatLng((double) gmu.A00, (double) gmu.A01);
        UserSession userSession2 = userSession;
        AnonymousClass4AB A00 = A00(r7, userSession2);
        User A0j = DbT.A0j(userSession2);
        long A0I = AnonymousClass7TG.A0I();
        Integer num = osv2.A02;
        Integer num2 = AnonymousClass05K.A00;
        boolean A1W = AnonymousClass7TF.A1W(num, num2);
        if (!AnonymousClass7TF.A1Y(gmu.A03, true)) {
            num2 = AnonymousClass05K.A0C;
        }
        return new N3Q(latLng, A00, A0j, num2, str, str2, (String) null, (String) null, Integer.MAX_VALUE, A0I, A1W, false, true, false, false, false, false);
    }
}
