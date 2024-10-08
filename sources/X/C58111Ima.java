package X;

import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.Ima  reason: case insensitive filesystem */
public final class C58111Ima extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58111Ima(C54562HIx hIx, WriteWithAICreationViewModel writeWithAICreationViewModel, String str, AnonymousClass4D7 r5) {
        super(3, r5);
        this.A02 = 2;
        this.A03 = writeWithAICreationViewModel;
        this.A04 = str;
        this.A00 = hIx;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C69068Ne7 ne7;
        String str;
        int i;
        C58111Ima ima;
        int i2 = this.A02;
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        Object obj4 = this.A03;
        switch (i2) {
            case 0:
                ne7 = (C69068Ne7) obj4;
                str = this.A04;
                i = 0;
                break;
            case 1:
                ne7 = (C69068Ne7) obj4;
                str = this.A04;
                i = 1;
                break;
            default:
                String str2 = this.A04;
                ima = new C58111Ima((C54562HIx) this.A00, (WriteWithAICreationViewModel) obj4, str2, r7);
                break;
        }
        ima = new C58111Ima(ne7, str, r7, i);
        ima.A00 = obj;
        ima.A01 = obj2;
        return ima.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0sm r5;
        List list;
        List list2;
        List list3;
        String str;
        C69068Ne7 ne7;
        String str2;
        String str3;
        String str4;
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                list3 = (List) this.A00;
                list2 = (List) this.A01;
                ne7 = (C69068Ne7) this.A03;
                str = this.A04;
                r5 = 0Yt.A0E();
                list = 0sn.A00;
                break;
            case 1:
                0eS.A00(obj);
                list2 = (List) this.A00;
                r5 = (Map) this.A01;
                ne7 = (C69068Ne7) this.A03;
                str = this.A04;
                list3 = 0sn.A00;
                list = list3;
                break;
            default:
                0eS.A00(obj);
                Object obj2 = this.A01;
                WriteWithAICreationViewModel writeWithAICreationViewModel = (WriteWithAICreationViewModel) this.A03;
                05G r1 = writeWithAICreationViewModel.A0A;
                C54721HQa hQa = ((C56141HtT) r1.getValue()).A01;
                if (hQa instanceof C54562HIx) {
                    C54562HIx hIx = (C54562HIx) hQa;
                    if (hIx.A03.isEmpty()) {
                        boolean z = obj2 instanceof CancellationException;
                        String str5 = this.A04;
                        C54562HIx hIx2 = (C54562HIx) this.A00;
                        List list4 = null;
                        if (hIx2 != null) {
                            list4 = hIx2.A03;
                            str2 = hIx2.A00;
                            str3 = hIx2.A01;
                            str4 = hIx2.A02;
                        } else {
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        WriteWithAICreationViewModel.A05(writeWithAICreationViewModel, ((C56141HtT) r1.getValue()).A03, str5, str2, str3, str4, ((C56141HtT) r1.getValue()).A04, list4, z);
                    } else {
                        String str6 = this.A04;
                        List list5 = hIx.A04;
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list5) {
                            if (next instanceof C57590IdH) {
                                A1C.add(next);
                            }
                        }
                        WriteWithAICreationViewModel.A07(writeWithAICreationViewModel, str6, hIx.A00, hIx.A01, hIx.A02, ((C56141HtT) r1.getValue()).A04, A1C, false, false);
                    }
                }
                return C60340gF.A00;
        }
        return C69068Ne7.A00(ne7, str, list3, list2, list, r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58111Ima(C69068Ne7 ne7, String str, AnonymousClass4D7 r4, int i) {
        super(3, r4);
        this.A02 = i;
        this.A03 = ne7;
        this.A04 = str;
    }
}
