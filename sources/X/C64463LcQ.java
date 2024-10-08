package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;

/* renamed from: X.LcQ  reason: case insensitive filesystem */
public final class C64463LcQ implements 2IR {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C64463LcQ(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onFailure(Throwable th) {
        if (this.A00 != 0) {
            0qQ.A0B(th, 0);
            0KC.A0L("NudityModelDownloadManager", "runMantleWithConfigStr callback onFailure for usecase %s", th, new Object[]{this.A02});
            return;
        }
        DirectShareSheetFragmentViewModel.A05((DirectShareSheetFragmentViewModel) this.A01, (C42829Bjb) null, this.A02);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C42829Bjb bjb;
        MantleDataValue mantleDataValue;
        String str;
        if (this.A00 != 0) {
            ImmutableMap immutableMap = (ImmutableMap) obj;
            if (immutableMap != null && immutableMap.containsKey("model_path") && (mantleDataValue = (MantleDataValue) immutableMap.get("model_path")) != null) {
                Object obj2 = mantleDataValue.value;
                if (obj2 == null || mantleDataValue.type != C301305yu.STRING) {
                    str = "";
                } else {
                    str = (String) obj2;
                    if (str == null) {
                        return;
                    }
                }
                if (str.length() != 0) {
                    C262224Cq r0 = LNv.A02;
                    0xY A0p = AnonymousClass7TE.A0p(((LNv) this.A01).A00);
                    A0p.E5g(C273654mx.A00(857), str);
                    A0p.apply();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass3JD r4 = (AnonymousClass3JD) obj;
        DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = (DirectShareSheetFragmentViewModel) this.A01;
        String str2 = this.A02;
        if (r4 != null) {
            bjb = (C42829Bjb) r4.Bny();
        } else {
            bjb = null;
        }
        DirectShareSheetFragmentViewModel.A05(directShareSheetFragmentViewModel, bjb, str2);
    }
}
