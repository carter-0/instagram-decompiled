package X;

/* renamed from: X.Mzs  reason: case insensitive filesystem */
public final class C68083Mzs extends 2NZ {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68083Mzs(C251983oI r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0087, code lost:
        r7.ADh(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0062, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007a, code lost:
        X.JTT.A17(r7, r2.A01, 4);
        X.JTT.A17(r7, r2.A00, 5);
        r0 = 6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A01(X.AnonymousClass1WV r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0047;
                case 2: goto L_0x005e;
                case 3: goto L_0x0064;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.N3X r8 = (X.N3X) r8
            int r0 = r8.A01
            long r1 = (long) r0
            r0 = 1
            r7.ADa(r0, r1)
            java.lang.String r3 = r8.A05
            r0 = 2
            r7.ADh(r0, r3)
            long r3 = r8.A03
            r0 = 3
            r7.ADa(r0, r3)
            java.lang.String r3 = r8.A04
            r0 = 4
            X.JTT.A17(r7, r3, r0)
            r5 = 5
            int r0 = r8.A00
            long r3 = (long) r0
            r7.ADa(r5, r3)
            r0 = 6
            long r3 = r8.A02
            r7.ADa(r0, r3)
            boolean r3 = r8.A07
            r0 = 7
            long r3 = (long) r3
            r7.ADa(r0, r3)
            boolean r3 = r8.A06
            r0 = 8
            long r3 = (long) r3
            r7.ADa(r0, r3)
            r0 = 9
            r7.ADa(r0, r1)
            return
        L_0x0042:
            X.MpA r8 = (X.C67515MpA) r8
            java.lang.String r3 = r8.A03
            goto L_0x0062
        L_0x0047:
            X.MpA r8 = (X.C67515MpA) r8
            java.lang.String r3 = r8.A03
            r0 = 1
            r7.ADh(r0, r3)
            java.lang.String r1 = r8.A02
            r0 = 2
            r7.ADh(r0, r1)
            double r0 = r8.A00
            r2 = 3
            r7.ADY(r2, r0)
            X.N49 r2 = r8.A01
            goto L_0x007a
        L_0x005e:
            X.Mp8 r8 = (X.C67513Mp8) r8
            java.lang.String r3 = r8.A03
        L_0x0062:
            r0 = 1
            goto L_0x0087
        L_0x0064:
            X.Mp8 r8 = (X.C67513Mp8) r8
            java.lang.String r3 = r8.A03
            r0 = 1
            r7.ADh(r0, r3)
            java.lang.String r1 = r8.A02
            r0 = 2
            r7.ADh(r0, r1)
            double r1 = r8.A00
            r0 = 3
            r7.ADY(r0, r1)
            X.N49 r2 = r8.A01
        L_0x007a:
            java.lang.String r1 = r2.A01
            r0 = 4
            X.JTT.A17(r7, r1, r0)
            java.lang.String r1 = r2.A00
            r0 = 5
            X.JTT.A17(r7, r1, r0)
            r0 = 6
        L_0x0087:
            r7.ADh(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68083Mzs.A01(X.1WV, java.lang.Object):void");
    }

    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "DELETE FROM `bff_ranked_user_model` WHERE `igid` = ?";
            case 1:
                return "UPDATE OR ABORT `bff_ranked_user_model` SET `igid` = ?,`entity_type` = ?,`score` = ?,`username` = ?,`profile_picture_url` = ? WHERE `igid` = ?";
            case 2:
                return "DELETE FROM `call_recipients_ranked_user_model` WHERE `igid` = ?";
            case 3:
                return "UPDATE OR ABORT `call_recipients_ranked_user_model` SET `igid` = ?,`entity_type` = ?,`score` = ?,`username` = ?,`profile_picture_url` = ? WHERE `igid` = ?";
            default:
                return "UPDATE OR ABORT `participant_device_change` SET `id` = ?,`user_id` = ?,`participantUserId` = ?,`device_name` = ?,`device_change_type` = ?,`device_change_timestamp_ms` = ?,`should_display_device_change_admin_message` = ?,`is_interop_participant` = ? WHERE `id` = ?";
        }
    }
}
