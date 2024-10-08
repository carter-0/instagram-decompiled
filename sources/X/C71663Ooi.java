package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Ooi  reason: case insensitive filesystem */
public final class C71663Ooi implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C71663Ooi(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = z;
    }

    public final void onCompletion(Object obj) {
        if (this.A00 != 0) {
            11Z.A02(new C73369PbS((C68966Nbt) this.A03, (MsysThreadId) this.A01, (C254743sy) this.A02, this.A04));
            return;
        }
        AnonymousClass67Z r6 = (AnonymousClass67Z) this.A01;
        List list = (List) this.A02;
        C68313NAa nAa = (C68313NAa) this.A03;
        boolean z = this.A04;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        Object obj2 = mailboxNullable.value;
        if (obj2 == null || C66580MXl.A04((C301345z0) obj2) == 0) {
            C66582MXn.A1F(r6, false);
            return;
        }
        HashSet A12 = C66580MXl.A12(list);
        ArrayList A0m = C51970G9q.A0m(list);
        ArrayList A0m2 = C51970G9q.A0m(list);
        for (int i = 0; i < C66580MXl.A04((C301345z0) mailboxNullable.value); i++) {
            long j = ((C301345z0) mailboxNullable.value).mResultSet.getLong(i, 1);
            Long nullableLong = ((C301345z0) mailboxNullable.value).mResultSet.getNullableLong(i, 2);
            if (A12.contains(((C301345z0) mailboxNullable.value).mResultSet.getString(i, 0)) && nullableLong != null) {
                AnonymousClass7TE.A1Y(A0m, j);
                A0m2.add(nullableLong);
            }
        }
        C71721Opf opf = new C71721Opf(r6, 8);
        AnonymousClass68L A0F = C66580MXl.A0F(nAa, 0);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0F, opf);
        C66582MXn.A1E(A0F, new C71668Oon(A0J, nAa, A0m, A0m2, z), A0J);
    }
}
