package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.Arrays;

/* renamed from: X.7jk  reason: invalid class name and case insensitive filesystem */
public final class C339527jk implements 1wn {
    public final /* synthetic */ C339407jY A00;

    public C339527jk(C339407jY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(653059200);
        C339547jm r10 = (C339547jm) obj;
        int A032 = AnonymousClass0fD.A03(875346056);
        0qQ.A0B(r10, 0);
        C339407jY r5 = this.A00;
        C339407jY.A01(C339417jZ.A02, r5);
        NewFundraiserInfo newFundraiserInfo = r10.A01;
        FundraiserDisplayInfoModel fundraiserDisplayInfoModel = r10.A00;
        r5.A04 = newFundraiserInfo;
        r5.A03 = fundraiserDisplayInfoModel;
        C339407jY.A00(C358088aL.A0Y, r5, true);
        String str = fundraiserDisplayInfoModel.A00;
        if (str == null) {
            str = fundraiserDisplayInfoModel.A01;
        }
        Context context = r5.A0F;
        C358248ab r52 = new C358248ab(context);
        r52.A05 = context.getResources().getString(2131963893);
        String format = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{context.getResources().getString(2131963891, new Object[]{str}), context.getResources().getString(2131963892)}, 2));
        0qQ.A07(format);
        r52.A0q(format);
        String string = context.getResources().getString(2131968772);
        0qQ.A07(string);
        r52.A0a((DialogInterface.OnClickListener) null, string);
        AnonymousClass0fN.A00(r52.A02());
        AnonymousClass0fD.A0A(1203821380, A032);
        AnonymousClass0fD.A0A(1423857074, A03);
    }
}
