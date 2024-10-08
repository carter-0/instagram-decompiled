package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.692  reason: invalid class name */
public final class AnonymousClass692 {
    public C3029065w A00;
    public C300185wg A01;
    public AccountSession A02;
    public AuthData A03;
    public String A04;
    public final C300355wz A05;
    public final AnonymousClass693 A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass692(C300355wz r5, C3029065w r6, C300185wg r7, AccountSession accountSession, AuthData authData, Boolean bool, String str, boolean z, boolean z2) {
        String str2;
        this.A02 = accountSession;
        this.A03 = authData;
        str = str == null ? 002.A0R("msys_database_", authData.getFacebookUserID()) : str;
        this.A04 = str;
        this.A01 = r7;
        File databasePath = r7.A01.getDatabasePath(str);
        File parentFile = databasePath.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        try {
            str2 = databasePath.getCanonicalPath();
        } catch (IOException unused) {
            str2 = databasePath.getAbsolutePath();
        }
        this.A09 = str2;
        this.A00 = r6;
        this.A0C = z2;
        this.A0A = z;
        this.A08 = true;
        this.A0B = true;
        this.A05 = r5;
        this.A07 = bool;
        AnonymousClass693 r0 = new AnonymousClass693();
        this.A06 = r0;
        Map map = r0.A00;
        map.put("COURIER_ENABLED", false);
        map.put("COURIER_CQL_ENABLED", false);
        map.put("RO_THREADS", 0);
        map.put("RW_THREADS", 0);
    }
}
