package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.5rB  reason: invalid class name and case insensitive filesystem */
public final class C297105rB implements Callable {
    public final /* synthetic */ AnonymousClass92U A00;
    public final /* synthetic */ List A01;

    public C297105rB(AnonymousClass92U r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        DELETE FROM content_filter_dictionary_client_availability");
        sb.append("\n");
        sb.append("        WHERE dictionary_id IN (");
        List<Number> list = this.A01;
        1wO.A00(sb, list.size());
        sb.append(")");
        sb.append("\n");
        sb.append("      ");
        String obj = sb.toString();
        C251983oI r5 = this.A00.A05;
        AnonymousClass1WV compileStatement = r5.compileStatement(obj);
        int i = 1;
        for (Number longValue : list) {
            compileStatement.ADa(i, longValue.longValue());
            i++;
        }
        r5.beginTransaction();
        try {
            compileStatement.ATQ();
            r5.setTransactionSuccessful();
            return C60340gF.A00;
        } finally {
            r5.endTransaction();
        }
    }
}
