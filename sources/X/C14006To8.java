package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.To8  reason: case insensitive filesystem */
public final /* synthetic */ class C14006To8 implements AnonymousClass2Kv {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass27m A01;

    public /* synthetic */ C14006To8(UserSession userSession, AnonymousClass27m r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.ViK] */
    public final void invoke(AnonymousClass3JD r27) {
        Object Bny;
        Long A0n;
        Long A0n2;
        Long A10;
        Long A102;
        AnonymousClass27m r13 = this.A01;
        UserSession userSession = this.A00;
        if (r27 != null && (Bny = r27.Bny()) != null) {
            C250663lr r5 = (C250663lr) Bny;
            Class<C14189TrT> cls = C14189TrT.class;
            if (r5.getOptionalTreeField(0, "ig_presence_subscribe(data:$input)", cls, 1976380084) != null) {
                C250663lr optionalTreeField = r5.getOptionalTreeField(0, "ig_presence_subscribe(data:$input)", cls, 1976380084);
                0qQ.A0B(optionalTreeField, 0);
                long j = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                long j2 = 0;
                String optionalStringField = optionalTreeField.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                String A09 = optionalTreeField.A09("last_activity_at_ms");
                if (!(A09 == null || (A102 = AnonymousClass7TE.A10(A09)) == null)) {
                    j2 = A102.longValue();
                }
                if (optionalTreeField.hasFieldValue("is_active")) {
                    z2 = optionalTreeField.getCoercedBooleanField(1, "is_active");
                }
                String A0B = optionalTreeField.A0B("app_title");
                if (optionalTreeField.hasFieldValue("copresence_enabled")) {
                    z = optionalTreeField.getCoercedBooleanField(6, "copresence_enabled");
                }
                String A0C = optionalTreeField.A0C("capabilities");
                if (!(A0C == null || (A10 = AnonymousClass7TE.A10(A0C)) == null)) {
                    j = A10.longValue();
                }
                String optionalStringField2 = optionalTreeField.getOptionalStringField(9, "correlation_id");
                ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(7, "thread_copresence_payloads", URB.class, -945383389);
                0qQ.A07(requiredCompactedTreeListField);
                ArrayList<C17929ViK> A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C250663lr r52 = (C250663lr) it.next();
                    0qQ.A0B(r52, 0);
                    ? obj = new Object();
                    String optionalStringField3 = r52.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                    String str = "";
                    if (optionalStringField3 == null) {
                        optionalStringField3 = str;
                    }
                    obj.A06 = optionalStringField3;
                    String A0A = r52.A0A("thread_fbid");
                    if (A0A != null) {
                        str = A0A;
                    }
                    obj.A05 = str;
                    if (r52.hasFieldValue("is_user_present_in_thread")) {
                        obj.A08 = r52.getCoercedBooleanField(2, "is_user_present_in_thread");
                    }
                    if (r52.hasFieldValue("is_in_reels_together")) {
                        obj.A07 = r52.getCoercedBooleanField(4, "is_in_reels_together");
                    }
                    String A08 = r52.A08("capabilities");
                    if (!(A08 == null || (A0n2 = 00y.A0n(10, A08)) == null)) {
                        obj.A00 = A0n2.longValue();
                    }
                    obj.A02 = r52.A0C("mutation_id");
                    obj.A04 = r52.getOptionalStringField(6, "real_time_update_id");
                    obj.A03 = r52.getOptionalStringField(7, "publish_timestamp");
                    obj.A01 = r52.A0D("ig_thread_id");
                    A0p.add(obj);
                }
                ImmutableList requiredCompactedTreeListField2 = optionalTreeField.getRequiredCompactedTreeListField(8, "reels_together_copresence_payloads", URA.class, -1655002541);
                0qQ.A07(requiredCompactedTreeListField2);
                ArrayList<C17928ViJ> A0p2 = AnonymousClass7TF.A0p(requiredCompactedTreeListField2);
                Iterator it2 = requiredCompactedTreeListField2.iterator();
                while (it2.hasNext()) {
                    C250663lr r53 = (C250663lr) it2.next();
                    0qQ.A0B(r53, 0);
                    C17928ViJ viJ = new C17928ViJ();
                    String optionalStringField4 = r53.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                    String str2 = "";
                    if (optionalStringField4 == null) {
                        optionalStringField4 = str2;
                    }
                    viJ.A07 = optionalStringField4;
                    String A082 = r53.A08("capabilities");
                    if (!(A082 == null || (A0n = 00y.A0n(10, A082)) == null)) {
                        viJ.A01 = A0n.longValue();
                    }
                    if (r53.hasFieldValue("is_in_reels_together")) {
                        viJ.A08 = r53.getCoercedBooleanField(5, "is_in_reels_together");
                    }
                    String A092 = r53.A09("surface_id");
                    if (A092 != null) {
                        str2 = A092;
                    }
                    viJ.A06 = str2;
                    if (r53.hasFieldValue("surface_type")) {
                        viJ.A00 = r53.getCoercedIntField(3, "surface_type");
                    }
                    viJ.A02 = r53.A0B("clip_id");
                    viJ.A03 = r53.getOptionalStringField(6, "mutation_id");
                    viJ.A05 = r53.getOptionalStringField(7, "real_time_update_id");
                    viJ.A04 = r53.getOptionalStringField(8, "publish_timestamp");
                    A0p2.add(viJ);
                }
                if (optionalTreeField.hasFieldValue("is_close_friend")) {
                    z3 = optionalTreeField.getCoercedBooleanField(10, "is_close_friend");
                }
                if (DbV.A1Y(userSession) && !C265504Uf.A01(userSession)) {
                    if (optionalStringField != null) {
                        r13.A02.A02(new C251053mU(optionalStringField, A0B, optionalStringField2, j2, j, z2, z3));
                    } else {
                        throw new IllegalStateException(AnonymousClass000.A00(4166));
                    }
                }
                boolean z4 = true;
                boolean A1Q = AnonymousClass7TF.A1Q(A0p.isEmpty() ? 1 : 0);
                if (A0p2.isEmpty()) {
                    z4 = false;
                }
                if (A1Q || z4) {
                    for (C17929ViK viK : A0p) {
                        String str3 = viK.A04;
                        if (str3 != null) {
                            int nextInt = new Random().nextInt();
                            02m r2 = 02m.A0p;
                            0qQ.A0B(r2, 4);
                            r2.A0U(656616479, nextInt, str3);
                            r2.markerPoint(656616479, nextInt, "client_received_thread_copresence_update");
                            r2.markerEnd(656616479, nextInt, 2);
                        }
                    }
                    for (C17928ViJ viJ2 : A0p2) {
                        String str4 = viJ2.A05;
                        if (str4 != null) {
                            int nextInt2 = new Random().nextInt();
                            02m r22 = 02m.A0p;
                            0qQ.A0B(r22, 4);
                            r22.A0U(656616479, nextInt2, str4);
                            r22.markerPoint(656616479, nextInt2, "client_received_reels_together_update");
                            r22.markerEnd(656616479, nextInt2, 2);
                        }
                    }
                    VFN.A00(r13.A00, userSession, A0p, A0p2);
                    r13.A01.A00(A0p, A0p2, z);
                }
            }
        }
    }
}
