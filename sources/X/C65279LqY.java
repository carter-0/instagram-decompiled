package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.LqY  reason: case insensitive filesystem */
public final class C65279LqY implements C66558MWm {
    public final 2NZ A00;
    public final 1Vf A01;
    public final C251983oI A02;
    public final 1Vg A03;
    public final 1Vg A04;
    public final 1Vg A05;
    public final 1Vg A06;
    public final 1Vg A07;
    public final 1Vg A08;

    public final C61018JvI AVL(String str, int i) {
        C61018JvI jvI;
        Long l;
        Long l2;
        String str2;
        String str3;
        String str4;
        Long l3;
        Double d;
        Double d2;
        1WY A0M = JTO.A0M("\n    SELECT *\n    FROM security_alert\n    WHERE user_id = ?\n      AND device_id = ?\n      AND device_change_type = 2\n    ORDER BY created_timestamp_ms DESC\n    LIMIT 1\n  ", 2);
        A0M.ADh(1, str);
        Cursor A002 = A00(A0M, this, 2, (long) i);
        try {
            int A012 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(A002, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A014 = 1Wd.A01(A002, "crypto_mailbox_type");
            int A015 = 1Wd.A01(A002, "device_change_type");
            int A016 = 1Wd.A01(A002, C66955Mfo.A01());
            int A017 = 1Wd.A01(A002, "created_timestamp_ms");
            int A018 = 1Wd.A01(A002, "first_read_timestamp_ms");
            int A019 = 1Wd.A01(A002, "model");
            int A0110 = 1Wd.A01(A002, "platform");
            int A0111 = 1Wd.A01(A002, "location");
            int A0112 = 1Wd.A01(A002, AnonymousClass000.A00(240));
            int A0113 = 1Wd.A01(A002, Location.LATITUDE);
            int A0114 = 1Wd.A01(A002, "longitude");
            int A0115 = 1Wd.A01(A002, "is_confirm");
            if (A002.moveToFirst()) {
                String string = A002.getString(A012);
                String string2 = A002.getString(A013);
                int i2 = A002.getInt(A014);
                int i3 = A002.getInt(A015);
                int i4 = A002.getInt(A016);
                if (A002.isNull(A017)) {
                    l = null;
                } else {
                    l = JTQ.A0S(A002, A017);
                }
                if (A002.isNull(A018)) {
                    l2 = null;
                } else {
                    l2 = JTQ.A0S(A002, A018);
                }
                if (A002.isNull(A019)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A019);
                }
                if (A002.isNull(A0110)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A0110);
                }
                if (A002.isNull(A0111)) {
                    str4 = null;
                } else {
                    str4 = A002.getString(A0111);
                }
                if (A002.isNull(A0112)) {
                    l3 = null;
                } else {
                    l3 = JTQ.A0S(A002, A0112);
                }
                if (A002.isNull(A0113)) {
                    d = null;
                } else {
                    d = Double.valueOf(A002.getDouble(A0113));
                }
                if (A002.isNull(A0114)) {
                    d2 = null;
                } else {
                    d2 = Double.valueOf(A002.getDouble(A0114));
                }
                jvI = new C61018JvI(d, d2, l, l2, l3, string, string2, str2, str3, str4, i2, i3, i4, AnonymousClass7TF.A1P(A002.getInt(A0115)));
            } else {
                jvI = null;
            }
            return jvI;
        } finally {
            A002.close();
            A0M.A00();
        }
    }

    public C65279LqY(C251983oI r3) {
        this.A02 = r3;
        this.A01 = new C60720Jq9(r3, this, 0);
        this.A00 = new C60716Jq5(r3, this, 0);
        this.A08 = new C60724JqD(r3, this, 0);
        this.A03 = new C60724JqD(r3, this, 1);
        this.A07 = new C60724JqD(r3, this, 2);
        this.A06 = new C60724JqD(r3, this, 3);
        this.A04 = new C60724JqD(r3, this, 4);
        this.A05 = new C60724JqD(r3, this, 5);
    }

    public static Cursor A00(1WY r2, C65279LqY lqY, int i, long j) {
        r2.ADa(i, j);
        C251983oI r1 = lqY.A02;
        r1.assertNotSuspendingTransaction();
        return r1.query((AnonymousClass1WA) r2, (CancellationSignal) null);
    }
}
