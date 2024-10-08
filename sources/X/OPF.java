package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.direct.HighlightRange;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class OPF {
    public static SpannableStringBuilder A00(Context context, C68035Mz2 mz2, String str, String str2, boolean z) {
        ImmutableList immutableList = mz2.A00;
        SpannableString A0D = C66580MXl.A0D(str);
        Pattern pattern = 0mp.A06;
        int A05 = DbX.A05(str);
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            HighlightRange highlightRange = (HighlightRange) it.next();
            if (highlightRange.A02 >= Math.min(highlightRange.A00 + 1, A05)) {
                break;
            }
            A0D.setSpan(new StyleSpan(1), highlightRange.A02, Math.min(highlightRange.A00 + 1, A05), 33);
            A0D.setSpan(C66580MXl.A0E(C51968G9o.A04(context)), highlightRange.A02, Math.min(highlightRange.A00 + 1, A05), 33);
        }
        SpannableStringBuilder A0C = DbS.A0C(A0D);
        if (z) {
            str2 = 002.A0R("…", str2);
        }
        A0C.append(str2);
        return A0C;
    }

    public static void A01(AnonymousClass0iw r5, UserSession userSession, C68035Mz2 mz2, Boolean bool, List list) {
        boolean booleanValue = bool.booleanValue();
        if (!booleanValue || !182.A06(0Tu.A05, userSession, 36327670908205671L)) {
            C66582MXn.A1G(mz2.A01);
            AnonymousClass34S A02 = AnonymousClass3UE.A02((ImageUrl) null, DbT.A0j(userSession), (String) null, list);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = mz2.A02;
            ImageUrl imageUrl = (ImageUrl) A02.A00;
            if (!booleanValue) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, imageUrl);
            } else {
                gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, r5, imageUrl, (ImageUrl) A02.A01);
            }
        } else {
            ArrayList A05 = AnonymousClass3UE.A05(DbT.A0j(userSession), list, false);
            mz2.A02.setVisibility(8);
            IgdsFaceSwarm igdsFaceSwarm = (IgdsFaceSwarm) mz2.A01.getView();
            igdsFaceSwarm.setVisibility(0);
            igdsFaceSwarm.A08 = false;
            igdsFaceSwarm.setImageUrls(A05, r5);
        }
    }
}
