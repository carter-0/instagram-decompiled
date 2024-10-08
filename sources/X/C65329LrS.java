package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.LrS  reason: case insensitive filesystem */
public final class C65329LrS implements C253023q5, C253043q7 {
    public final MXF A00;
    public final MediaKitRepository A01;
    public final C60327JjW A02;
    public final UserSession A03;

    public final void D2e(ClickableSpan clickableSpan, View view, String str) {
        0qQ.A0B(str, 0);
        A00(this, new C65460Lti(str));
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        A00(this, new C65463Ltl(str));
    }

    public static final void A00(C65329LrS lrS, C66407MQn... mQnArr) {
        lrS.A02.A05((C66407MQn[]) Arrays.copyOf(mQnArr, mQnArr.length));
    }

    public final void A01(C61220JzD jzD) {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig;
        MediaKitInfoSheetItemModel[] mediaKitInfoSheetItemModelArr;
        String str;
        User user;
        int ordinal = jzD.A01.ordinal();
        if (ordinal == 2) {
            C64127LPb.A01(this.A00, AnonymousClass05K.A0Z);
            MediaKitInfoSheetConfig mediaKitInfoSheetConfig2 = MediaKitInfoSheetConfig.A0D;
            mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966567);
            mediaKitInfoSheetItemModelArr = new MediaKitInfoSheetItemModel[]{new MediaKitInfoSheetItemModel(2131966593, 2131966590, (Integer) null), new MediaKitInfoSheetItemModel(2131966592, 2131966591, (Integer) null), new MediaKitInfoSheetItemModel(2131966588, 2131966589, (Integer) null)};
        } else if (ordinal == 1) {
            C64127LPb.A01(this.A00, AnonymousClass05K.A0a);
            MediaKitInfoSheetConfig mediaKitInfoSheetConfig3 = MediaKitInfoSheetConfig.A0D;
            C61221JzE jzE = (C61221JzE) this.A02.A0M.getValue();
            if (jzE == null || (user = jzE.A01) == null) {
                str = "";
            } else {
                str = user.getUsername();
            }
            mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966618);
            mediaKitInfoSheetConfig.A01 = Float.valueOf(0.3f);
            mediaKitInfoSheetConfig.A02 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            MediaKitInfoSheetItemModel mediaKitInfoSheetItemModel = new MediaKitInfoSheetItemModel((Integer) null, 2131966558, (Integer) null);
            mediaKitInfoSheetItemModel.A00 = new Object[]{str};
            mediaKitInfoSheetItemModelArr = new MediaKitInfoSheetItemModel[]{mediaKitInfoSheetItemModel};
        } else {
            return;
        }
        018.A18(mediaKitInfoSheetConfig.A0C, mediaKitInfoSheetItemModelArr);
        A00(this, C65471Ltt.A00, new C65465Ltn(mediaKitInfoSheetConfig));
    }

    public C65329LrS(UserSession userSession, MXF mxf, MediaKitRepository mediaKitRepository, C60327JjW jjW) {
        this.A02 = jjW;
        this.A01 = mediaKitRepository;
        this.A03 = userSession;
        this.A00 = mxf;
    }
}
