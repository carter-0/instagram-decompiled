package X;

import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class TJ4 implements Runnable {
    public final /* synthetic */ SzT A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ TJ4(SzT szT, List list, List list2) {
        this.A00 = szT;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void run() {
        SzT szT = this.A00;
        List<File> list = this.A01;
        List list2 = this.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (File file : list) {
            String A002 = C9732Rfq.A00(file);
            Uri fromFile = Uri.fromFile(file);
            Intent A0E = Pxe.A0E();
            A0E.setDataAndType(fromFile, szT.A00.getContentResolver().getType(fromFile));
            A0E.addFlags(1);
            A0E.putExtra("module_name", A002.split("\\.config\\.", 2)[0]);
            A0E.putExtra("split_id", A002);
            A1C.add(A0E);
            A1C2.add(C9732Rfq.A00(file).split("\\.config\\.", 2)[0]);
        }
        C10893Rzt rzt = (C10893Rzt) szT.A09.get();
        if (rzt != null) {
            szT.A07.execute(new TKJ(szT, A1C, A1C2, list2, ((Qy2) rzt).A04));
        }
    }
}
