package X;

import com.facebook.msys.mca.MailboxFeature;
import com.google.common.collect.ImmutableList;

/* renamed from: X.On3  reason: case insensitive filesystem */
public final class C71568On3 implements AnonymousClass2Kv {
    public final /* synthetic */ C300675xb A00;

    public C71568On3(C300675xb r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r12) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        if (r12 == null || (A0U = C41845B3m.A0U(r12)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, "messaging_blackhole_urls(client_version_id:$client_version_id)", C43004Bpu.class, -419397277)) == null) {
            C300675xb.A00(this.A00);
            return;
        }
        C300675xb r7 = this.A00;
        Class<C7776QWn> cls = C7776QWn.class;
        if (optionalTreeField.getRequiredCompactedTreeListField(1, "blackhole_url_deltas", cls, -1109201669).size() != 0) {
            C71619Onz A01 = AnonymousClass6EU.A05.A00(r7.A00).A01();
            if (A01 != null) {
                1a8 A0P = C66581MXm.A0P();
                O84 o84 = new O84(A01);
                ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "blackhole_url_deltas", cls, -1109201669);
                0qQ.A07(requiredCompactedTreeListField);
                A0P.A02(C72120Owf.A02(C66581MXm.A0N(1aU.A09(new MailboxFeature(o84.A00)), "safebrowsing_instagram_standalone"), new C74185PqR(35, (Object) requiredCompactedTreeListField, (Object) o84), 64), PTX.A00);
            }
            1Av r5 = r7.A01;
            String optionalStringField = optionalTreeField.getOptionalStringField(0, "next_client_version_id");
            0xY A0p = AnonymousClass7TE.A0p(r5);
            A0p.E5g(C273654mx.A00(2095), optionalStringField);
            A0p.apply();
            long A06 = C66581MXm.A06();
            r5.A0J.Epx(r5, Long.valueOf(A06), 1Av.A8a[508]);
        }
    }
}
