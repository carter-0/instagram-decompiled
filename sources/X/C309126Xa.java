package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Xa  reason: invalid class name and case insensitive filesystem */
public abstract class C309126Xa {
    public static final ArrayList A00(Context context, UserSession userSession, C2806852z r7, C316316lS r8, List list, boolean z) {
        0qQ.A0B(r8, 3);
        ArrayList arrayList = new ArrayList();
        String string = context.getString(2131953217);
        0qQ.A07(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0nA.A0G(string));
        if (z) {
            C250563lf.A0M(context, spannableStringBuilder, userSession);
        }
        r8.A00();
        TextView textView = r8.A02;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            ImageView imageView = r8.A01;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_reels_filled_12);
                ViewGroup viewGroup = r8.A00;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    ViewGroup viewGroup2 = r8.A00;
                    if (viewGroup2 != null) {
                        arrayList.add(viewGroup2);
                        MusicOverlayStickerModel A06 = C271404in.A06(list);
                        if (A06 != null) {
                            C263314Kg.A03(userSession, A06, r7);
                            ViewGroup viewGroup3 = r7.A01;
                            if (viewGroup3 != null) {
                                arrayList.add(viewGroup3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        return arrayList;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A01(CreativeConfigIntf creativeConfigIntf) {
        if (creativeConfigIntf != null) {
            return C284745Nt.A0B(creativeConfigIntf, C306106Ku.CLIPS);
        }
        return false;
    }
}
