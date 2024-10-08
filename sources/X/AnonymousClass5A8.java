package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;

/* renamed from: X.5A8  reason: invalid class name */
public final class AnonymousClass5A8 implements AnonymousClass2gO {
    public final /* synthetic */ 2Fk A00;
    public final /* synthetic */ 2Fc A01;

    public AnonymousClass5A8(2Fk r1, 2Fc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        2Fc r4;
        2HH r6;
        2HH r5;
        DbR dbR;
        S21 s21 = (S21) obj;
        0qQ.A0B(s21, 0);
        Throwable th = s21.A02;
        boolean z = false;
        if (th == null) {
            z = true;
        }
        if (z) {
            AnonymousClass5A2 r3 = (AnonymousClass5A2) s21.A01;
            if (r3 == null || (dbR = (DbR) ((C250663lr) r3).getOptionalTreeField(0, "migrate_autofill_key(data:$input)", C8T.class, -596972262)) == null) {
                r6 = null;
                r5 = null;
            } else {
                C250663lr r32 = (C250663lr) dbR;
                2HH r2 = 2HH.A05;
                r6 = (2HH) r32.getOptionalEnumField(2, "app_migration_result", r2);
                r5 = (2HH) r32.getOptionalEnumField(3, "cross_app_migration_result", r2);
            }
            2HH r1 = 2HH.A04;
            if ((r6 == r1 || r6 == 2HH.A03) && (r5 == r1 || r5 == 2HH.A03)) {
                r4 = this.A01;
                C2818059q r9 = r4.A03;
                if (r9 != null) {
                    String A002 = C2818359t.A00(r6);
                    String A003 = C2818359t.A00(r5);
                    LinkedHashMap A012 = C2818359t.A01((String) null, r4.A00);
                    0wc r22 = r9.A00;
                    0Aj A004 = r22.A00(r22.A00, "client_copy_autofillproof_success");
                    if (A004.isSampled()) {
                        0bb r7 = new 0bb();
                        r7.A06("cross_app_migration_status", A003);
                        r7.A06("legacy_key_migration_status", A002);
                        r7.A03("legacy_key_migration_should_retry", false);
                        r7.A03("cross_app_migration_should_retry", false);
                        A004.AAJ(Py2.A01(9, 10, 6), r9.A01);
                        A004.A8M(2M7.A04, "product_type");
                        A004.A8M(C2818559v.ANDROID, "platform");
                        0qQ.A07(r9.A02.getValue());
                        A004.A9F(AnonymousClass000.A00(495), Long.valueOf(System.currentTimeMillis()));
                        A004.AAK(r7, AnonymousClass000.A00(1317));
                        A004.A9H("extra_data", A012);
                        A004.AAJ(TraceFieldType.ErrorCode, "");
                        A004.Cgf();
                    }
                    String A04 = 182.A04(0Tu.A06, r4.A03, 36873380867670029L);
                    r4.A00 = 0;
                    2Fu r33 = r4.A04;
                    0qQ.A07(2Fd.A07.getValue());
                    long currentTimeMillis = System.currentTimeMillis();
                    AnonymousClass2HB r23 = r33.A00;
                    r23.A02 = currentTimeMillis;
                    r33.A00();
                    r23.A00 = 0;
                    r33.A00();
                    r23.A03 = r6;
                    r33.A00();
                    r23.A04 = r5;
                    r33.A00();
                    if (2Fd.A06) {
                        r23.A05.put(A04, 0);
                        r33.A00();
                    }
                }
                0qQ.A0F("uplLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            r4 = this.A01;
            C2818059q r34 = r4.A03;
            if (r34 != null) {
                r34.A00((Exception) null, C2818359t.A00(r6), C2818359t.A00(r5), C2818359t.A01((String) null, r4.A00));
                r4.A01(r6, r5, 182.A04(0Tu.A06, r4.A03, 36873380867670029L));
            }
            0qQ.A0F("uplLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        r4 = this.A01;
        C2818059q r35 = r4.A03;
        if (r35 != null) {
            r35.A00(new Exception(th), "FAILURE", "FAILURE", C2818359t.A01((String) null, r4.A00));
            String A042 = 182.A04(0Tu.A06, r4.A03, 36873380867670029L);
            2HH r0 = 2HH.A02;
            r4.A01(r0, r0, A042);
        }
        0qQ.A0F("uplLogger");
        throw AnonymousClass00P.createAndThrow();
        this.A00.A05(Pxm.A08);
        r4.A05.clear();
    }
}
