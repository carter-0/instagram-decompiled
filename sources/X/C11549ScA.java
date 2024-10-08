package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

/* renamed from: X.ScA  reason: case insensitive filesystem */
public final class C11549ScA implements 1MD {
    public final /* synthetic */ C12414Str A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C11549ScA(C12414Str str, String str2, String str3, String str4, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = list;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        S4g s4g = (S4g) obj;
        this.A00.A00.getValue();
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        List list = this.A04;
        try {
            C12102Smx smx = (C12102Smx) C41847B3o.A16(S8n.class);
            2IS r2 = smx.A00;
            r2.A04("interface_type", "IG_ANDROID");
            smx.A02 = true;
            r2.A04("fe_id", str);
            r2.A04(Py7.A00(), str2);
            r2.A04("view_name", str3);
            r2.A05("subtypes_to_filter", ImmutableList.copyOf((Collection) list));
            1Ef build = smx.build();
            0qQ.A07(build);
            return C8294Qna.A00(s4g, C41847B3o.A0t(), build, Szg.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
