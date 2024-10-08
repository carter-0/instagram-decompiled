package X;

import android.content.Context;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.T5e  reason: case insensitive filesystem */
public final class C12744T5e implements C13664TeV {
    public boolean A00;
    public final Context A01;
    public final Map A02 = AnonymousClass7TE.A1H();

    public final void FMX(C11002S4w s4w, Long l, String str, String str2, List list) {
        String str3 = str;
        boolean A1X = DbW.A1X(str3);
        synchronized (this) {
            this.A02.clear();
            this.A00 = A1X;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass59G r0 = (AnonymousClass59G) it.next();
            String str4 = (String) r0.A00;
            File file = (File) r0.A01;
            String str5 = (String) r0.A02;
            SIZ siz = new SIZ();
            siz.A03 = "authenticity_uploads";
            siz.A01 = AnonymousClass05K.A01;
            siz.A02(SAE.class);
            siz.A02 = "124024574287414|84a456d620314b6e92a16d8ff1c792dc";
            String str6 = str2;
            if (str2 != null && !00l.A0W(str6)) {
                siz.A04.A05("id_or_cuid", str6);
            }
            String A002 = AnonymousClass000.A00(373);
            if (!(l == null || l.longValue() == 0)) {
                siz.A04.A05(A002, l.toString());
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(JTP.A0u(file)));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "image/jpeg";
            }
            1Fc r6 = siz.A04;
            r6.A00.put("upload1", new T6D(file, mimeTypeFromExtension));
            r6.A05("upload_medium", str5);
            Context context = this.A01;
            r6.A05(Dbg.A02(A1X ? 1 : 0, 9, 56), 0qv.A00(context));
            r6.A05("machine_id", 0qv.A02.A05(context));
            r6.A05("product", str3);
            r6.A05(Dbg.A00(), "session_id_unused");
            r6.A05("return_file_handles", "true");
            r6.A05("submit_to_authenticity_platform", "false");
            1OC A012 = siz.A01();
            A012.A00 = new C8762R8n(this, s4w, str4, list.size(), A1X ? 1 : 0);
            1ES.A03(A012);
        }
    }

    public C12744T5e(Context context) {
        this.A01 = context;
    }
}
