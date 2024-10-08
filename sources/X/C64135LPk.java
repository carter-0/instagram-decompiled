package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPk  reason: case insensitive filesystem */
public abstract class C64135LPk {
    public static final void A00(Activity activity, 28D r6, UserSession userSession, PromptStickerModel promptStickerModel) {
        AnonymousClass7TG.A1T(activity, userSession, promptStickerModel);
        Bundle A0a = AnonymousClass7TE.A0a();
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A08(AnonymousClass7TF.A0Q(userSession));
        A0a.putParcelable("prompt_sticker_model", A04.A02());
        A0a.putParcelable(C273654mx.A00(31), (Parcelable) null);
        A0a.putSerializable(AnonymousClass000.A00(117), r6);
        DbU.A0x(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(3236));
    }

    public static final void A01(Activity activity, UserSession userSession, List list) {
        Object obj;
        Activity activity2 = activity;
        AnonymousClass7TF.A1H(activity, userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2802350v r1 = (C2802350v) it.next();
            if (r1 instanceof PromptStickerModel) {
                PromptStickerModel A04 = ((PromptStickerModel) r1).A04();
                A04.A08(AnonymousClass7TF.A0Q(userSession));
                obj = A04.A02();
            } else if (r1 instanceof C40591Aef) {
                obj = ((C40591Aef) r1).A00;
            }
            A1C.add(obj);
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelableArrayList(AnonymousClass000.A00(522), A1C);
        LTL.A05(activity2, new FZF(activity, A0a, userSession, 4), 2RR.A01(), 0.2f, activity.getColor(R.color.black), activity.getColor(R.color.black), false);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, C66509MUn mUn, PromptStickerModel promptStickerModel, Integer num, String str, C62320sa r18, boolean z) {
        String str2;
        String str3;
        String Bhm;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1P(userSession, promptStickerModel);
        mUn.Cky(z);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!C305756Jk.A00(context) || !182.A06(0Tu.A05, userSession, 36327258591672595L) || !LQF.A00(userSession, C59809JZd.IMAGINE_ME)) {
            LIV.A00(fragmentActivity, userSession, mUn, promptStickerModel, str);
            return;
        }
        Integer num2 = num;
        if (z) {
            LI3.A01(fragmentActivity, userSession, C62498Kgo.LAUNCHED_FROM_STORY_VIEWER, num2);
            return;
        }
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A08(AnonymousClass7TF.A0Q(userSession));
        C73901Plc plc = new C73901Plc(r18, 38);
        C62498Kgo kgo = C62498Kgo.LAUNCHED_FROM_STORY_VIEWER;
        String A0j = AnonymousClass7TG.A0j();
        GenAIToolInfoDictIntf B91 = A04.A00.B91();
        if (B91 == null || (Bhm = B91.Bhm()) == null) {
            str2 = null;
        } else {
            str2 = DbV.A12(00l.A0F(C273654mx.A00(487), Bhm));
        }
        GenAIToolInfoDictIntf B912 = A04.A00.B91();
        if (B912 != null) {
            str3 = B912.Bk7();
        } else {
            str3 = null;
        }
        LI3.A00(fragmentActivity2, userSession2, kgo, A04, num2, A0j, str2, str3, MKD.A00, MKE.A00, plc, (C262224Cq) null, false, false);
    }
}
