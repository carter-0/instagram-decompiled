package X;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class E9F extends 2Ru implements G5R {
    public final C47620EAg A00;
    public final C47637EAx A01;
    public final EAT A02;
    public final EAU A03;
    public final FBPageListWithPreviewFragment A04;
    public final UserSession A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public final void D6n() {
        ImmutableList A0K;
        String str;
        C49710F2v f2v = this.A04.A03;
        Bundle A0a = AnonymousClass7TE.A0a();
        PageSelectionOverrideData pageSelectionOverrideData = f2v.A03;
        if (!(pageSelectionOverrideData == null || (str = pageSelectionOverrideData.A07) == null)) {
            A0a.putString("prior_step", str);
        }
        f2v.A00("create_page");
        G8D g8d = f2v.A02;
        g8d.getClass();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("prev_page_id", (Object) null);
        A1E.put("current_page_id", (Object) null);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        Iterator A0u = AnonymousClass7TF.A0u(A1E);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A0a2.putString(DbT.A13(A1J), DbS.A0s(A1J));
        }
        ConversionStep conversionStep = ConversionStep.CREATE_PAGE;
        BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) g8d;
        BusinessConversionActivity.A01(A0a2, businessConversionActivity);
        BusinessConversionActivity.A02(businessConversionActivity);
        businessConversionActivity.A08.add(conversionStep);
        C49883FBi fBi = businessConversionActivity.A01;
        if (fBi != null) {
            BusinessConversionFlowStatus businessConversionFlowStatus = fBi.A00;
            0qQ.A07(businessConversionFlowStatus);
            BusinessConversionStep businessConversionStep = new BusinessConversionStep(C48092EVk.NEXT, conversionStep);
            int i = businessConversionFlowStatus.A00;
            int i2 = i + 1;
            if (i2 >= 0) {
                ImmutableList immutableList = businessConversionFlowStatus.A01;
                if (i2 <= immutableList.size()) {
                    if (i2 == immutableList.size()) {
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        builder.addAll(immutableList);
                        builder.add(businessConversionStep);
                        A0K = builder.build();
                        0qQ.A0A(A0K);
                    } else {
                        ImmutableList.Builder builder2 = new ImmutableList.Builder();
                        int size = immutableList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (i3 == i2) {
                                builder2.add(businessConversionStep);
                            }
                            builder2.add(immutableList.get(i3));
                        }
                        A0K = DbZ.A0K(builder2);
                    }
                    fBi.A00 = new BusinessConversionFlowStatus(A0K, i);
                    C49883FBi fBi2 = businessConversionActivity.A01;
                    if (fBi2 != null) {
                        fBi2.A02();
                        BusinessConversionActivity.A03(businessConversionActivity, true);
                        return;
                    }
                }
            }
            throw DbT.A0m();
        }
        0qQ.A0F("conversionLogic");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E9F(Context context, FBPageListWithPreviewFragment fBPageListWithPreviewFragment, AnonymousClass0iw r8, UserSession userSession, CharSequence charSequence, String str) {
        super(false);
        AnonymousClass7TG.A1R(str, charSequence);
        this.A05 = userSession;
        this.A04 = fBPageListWithPreviewFragment;
        C47637EAx eAx = new C47637EAx(context, charSequence, str);
        this.A01 = eAx;
        EAU eau = new EAU(context, this, r8, userSession);
        this.A03 = eau;
        C47620EAg eAg = new C47620EAg(context, this);
        this.A00 = eAg;
        EAT eat = new EAT(context, this, r8, userSession);
        this.A02 = eat;
        init(new C231642s0[]{eAx, eau, eAg, eat});
    }
}
