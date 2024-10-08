package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9l5  reason: invalid class name and case insensitive filesystem */
public final class C386739l5 extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass454 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386739l5(UserSession userSession, AnonymousClass454 r5) {
        super(273, 4, false, false);
        this.A01 = r5;
        this.A00 = userSession;
    }

    public final void run() {
        String A18;
        HashSet A1F = AnonymousClass7TE.A1F();
        AnonymousClass454 r7 = this.A01;
        HashMap hashMap = r7.A07;
        Iterator it = AnonymousClass7TE.A1D(hashMap.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            String str = (String) A1J.getKey();
            if (!((AnonymousClass5JO) A1J.getValue()).CWR(r7.A04, this.A00, str)) {
                if (r7.A03(str)) {
                    0mb.A08(str);
                }
                hashMap.remove(str);
                A1F.add(str);
            }
        }
        try {
            1W6 A002 = r7.A06.A00("FileRegistry_cleanup");
            try {
                Iterator it2 = A1F.iterator();
                while (it2.hasNext()) {
                    A18 = AnonymousClass7TE.A18(it2);
                    A002.AON("file_registry", "file_path = ?", new String[]{A18});
                }
                if (A002 != null) {
                    A002.close();
                }
            } catch (RuntimeException unused) {
                0wb.A03("file_registry_delete", 002.A0R("Failed to delete file: ", A18));
            } catch (Throwable th) {
                if (A002 != null) {
                    A002.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            C9153RRe.A00(th, th2);
        }
    }
}
