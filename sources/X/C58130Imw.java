package X;

/* renamed from: X.Imw  reason: case insensitive filesystem */
public final /* synthetic */ class C58130Imw extends 03J implements C62320sa {
    public C58130Imw(Object obj) {
        super(0, obj, C263234Jv.class, "onDismiss", "onDismiss()V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C263234Jv r4 = (C263234Jv) this.receiver;
        AnonymousClass3W1 r5 = r4.A05;
        r5.A0K(AnonymousClass3WB.DISMISSED);
        AnonymousClass0kM A0M = DbY.A0M(r4.A01);
        AnonymousClass4DU r2 = r4.A02;
        A0M.A00 = r2;
        0Aj A0e = AnonymousClass7TE.A0e(A0M.A00(), "instagram_thumbnail_dismissal");
        if (A0e.isSampled()) {
            C51965G9l.A1C(AnonymousClass5OC.FEED_PREVIEW, A0e);
            DbW.A16(A0e, r2);
            1Xj r0 = r4.A00;
            if (r0 != null) {
                String id = r0.getId();
                if (id != null) {
                    C51965G9l.A1P(A0e, id);
                    C51970G9q.A19(A0e, (long) r5.getPosition());
                    1Xj r02 = r4.A00;
                    if (r02 != null) {
                        C51972G9s.A15(A0e, r02);
                        1Xj r03 = r4.A00;
                        if (r03 != null) {
                            C51972G9s.A14(A0e, r03);
                            A0e.Cgf();
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            0qQ.A0F("thumbnailMedia");
            throw AnonymousClass00P.createAndThrow();
        }
        return C60340gF.A00;
    }
}
