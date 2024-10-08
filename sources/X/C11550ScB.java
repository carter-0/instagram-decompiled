package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.ScB  reason: case insensitive filesystem */
public final class C11550ScB implements 1MD {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C11550ScB(Object obj, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        1Ef r2;
        FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor;
        AnonymousClass2hV r0;
        S4g s4g = (S4g) obj;
        switch (this.A00) {
            case 0:
                ((C12412Stp) this.A01).A00.getValue();
                String str = this.A05;
                String str2 = this.A02;
                String str3 = this.A03;
                String str4 = this.A04;
                try {
                    C12108Sn3 sn3 = (C12108Sn3) C41847B3o.A16(C11073S8t.class);
                    2IS r22 = sn3.A00;
                    r22.A04("payout_record_id", str4);
                    sn3.A04 = true;
                    r22.A04("fe_id", str2);
                    sn3.A02 = true;
                    r22.A04(Py7.A00(), str);
                    sn3.A05 = true;
                    r22.A04("interface_type", "IG_ANDROID");
                    sn3.A03 = true;
                    r22.A04("mma_id", str3);
                    r2 = sn3.build();
                    0qQ.A07(r2);
                    fBPayIGGraphQLQueryExecutor = C41847B3o.A0t();
                    r0 = Sze.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            case 1:
                ((C12417Stu) this.A01).A00.getValue();
                String str5 = this.A05;
                String str6 = this.A02;
                String str7 = this.A03;
                String str8 = this.A04;
                try {
                    C12109Sn4 sn4 = (C12109Sn4) C41847B3o.A16(C11074S8u.class);
                    2IS r23 = sn4.A00;
                    r23.A04("payout_release_id", str8);
                    sn4.A04 = true;
                    r23.A04("fe_id", str6);
                    sn4.A02 = true;
                    r23.A04(Py7.A00(), str5);
                    sn4.A05 = true;
                    r23.A04("interface_type", "IG_ANDROID");
                    sn4.A03 = true;
                    r23.A04("mma_id", str7);
                    r2 = sn4.build();
                    0qQ.A07(r2);
                    fBPayIGGraphQLQueryExecutor = C41847B3o.A0t();
                    r0 = Szj.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw C41845B3m.A0j(e2);
                }
            default:
                ((C12419Stx) this.A01).A00.getValue();
                String str9 = this.A04;
                String str10 = this.A02;
                String str11 = this.A03;
                String str12 = this.A05;
                try {
                    C12107Sn2 sn2 = (C12107Sn2) C41847B3o.A16(C11075S8v.class);
                    2IS r24 = sn2.A00;
                    r24.A04("fe_id", str9);
                    sn2.A02 = true;
                    r24.A04("interface_type", "IG_ANDROID");
                    sn2.A03 = true;
                    r24.A04(Py7.A00(), str12);
                    sn2.A04 = true;
                    r24.A03("first", 25);
                    r24.A04("after", str10);
                    r24.A04("filter_type", str11);
                    1Ef build = sn2.build();
                    0qQ.A07(build);
                    return C8294Qna.A00(s4g, C41847B3o.A0t(), build, C12604Szl.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw C41845B3m.A0j(e3);
                }
        }
        return C8294Qna.A00(s4g, fBPayIGGraphQLQueryExecutor, r2, r0);
    }
}
