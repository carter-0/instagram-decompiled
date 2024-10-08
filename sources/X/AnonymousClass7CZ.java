package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7CZ  reason: invalid class name */
public final class AnonymousClass7CZ {
    public static final AnonymousClass7CZ A00 = new Object();

    public static final TextView A00(TextView textView, Integer num, String str, boolean z) {
        0qQ.A0B(str, 1);
        if (str.length() == 0) {
            if (textView == null) {
                return null;
            }
            textView.setVisibility(8);
            return null;
        } else if (textView == null) {
            return null;
        } else {
            if (textView.getVisibility() == 0) {
                CharSequence text = textView.getText();
                0qQ.A07(text);
                if (str.contentEquals(text)) {
                    return null;
                }
            }
            if (z) {
                textView.post(new C73368PbR(textView, num, str, ((float) textView.getMeasuredHeight()) * 0.5f));
                return textView;
            }
            textView.setText(str);
            textView.setVisibility(0);
            return null;
        }
    }

    public static final List A02(LayoutInflater layoutInflater, LinearLayout linearLayout, LinearLayout linearLayout2, AnonymousClass0iw r27, UserSession userSession, ImageUrl imageUrl, String str, List list, boolean z, boolean z2, boolean z3) {
        IgImageView[] igImageViewArr;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        LinearLayout linearLayout3 = linearLayout;
        0qQ.A0B(linearLayout3, 1);
        LinearLayout linearLayout4 = linearLayout2;
        0qQ.A0B(linearLayout4, 2);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 3);
        List list2 = list;
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SimpleImageUrl((String) list2.get(i)));
        }
        AnonymousClass0iw r12 = r27;
        ImageUrl imageUrl2 = imageUrl;
        String str2 = str;
        if (str == null || !z3) {
            AnonymousClass7CZ r0 = A00;
            int i2 = R.layout.emoji_reaction_consumption_view;
            if (z) {
                i2 = R.layout.multi_react_emoji_consumption_view;
            }
            ArrayList A01 = A01(layoutInflater2, linearLayout3, linearLayout4, r12, userSession2, imageUrl2, arrayList, i2);
            if (!z2 || A01 == null) {
                return A01;
            }
            r0.A05(A01);
            return A01;
        }
        int i3 = R.layout.emoji_reaction_consumption_view;
        if (z) {
            i3 = R.layout.multi_react_emoji_consumption_view;
        }
        A01(layoutInflater2, linearLayout3, linearLayout4, r12, userSession2, imageUrl2, arrayList, i3);
        if (!z2) {
            return null;
        }
        int childCount = linearLayout4.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = linearLayout4.getChildAt(i4);
            0qQ.A0C(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            if (str2.equals(childAt.getTag(R.id.direct_reaction_emoji))) {
                IgImageView requireViewById = childAt.requireViewById(R.id.emoji_image);
                0qQ.A07(requireViewById);
                IgImageView igImageView = requireViewById;
                IgImageView requireViewById2 = childAt.requireViewById(R.id.overlay_image);
                0qQ.A07(requireViewById2);
                IgImageView igImageView2 = requireViewById2;
                IgImageView requireViewById3 = childAt.requireViewById(R.id.emoji_placeholder);
                0qQ.A07(requireViewById3);
                Context context = childAt.getContext();
                0qQ.A07(context);
                Drawable A002 = C59691JTy.A00(context, userSession2, imageUrl2);
                if (A002 != null) {
                    C71081Ob0.A00.A03(A002, requireViewById3, igImageView, igImageView2);
                    igImageViewArr = new IgImageView[2];
                    igImageViewArr[0] = igImageView2;
                } else {
                    0qQ.A0B(igImageView, 0);
                    igImageView.setVisibility(0);
                    requireViewById3.setVisibility(0);
                    requireViewById3.setScaleX(0.0f);
                    requireViewById3.setScaleY(0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(igImageView, "translationY", new float[]{-120.0f}).setDuration(280);
                    0qQ.A07(duration);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView, "scaleY", new float[]{1.0f, 3.0f});
                    ofFloat.setDuration(280);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView, "scaleX", new float[]{1.0f, 3.0f});
                    ofFloat2.setDuration(280);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(requireViewById3, "scaleY", new float[]{0.0f, 1.0f});
                    ofFloat3.setDuration(280);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(requireViewById3, "scaleX", new float[]{0.0f, 1.0f});
                    ofFloat4.setDuration(280);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(igImageView, "scaleY", new float[]{3.0f, 0.85f});
                    ObjectAnimator objectAnimator = ofFloat5;
                    objectAnimator.setDuration(210);
                    objectAnimator.setStartDelay(480);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView, "scaleX", new float[]{3.0f, 0.85f});
                    ObjectAnimator objectAnimator2 = ofFloat6;
                    objectAnimator2.setDuration(210);
                    objectAnimator2.setStartDelay(480);
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView, "translationY", new float[]{12.0f});
                    ObjectAnimator objectAnimator3 = ofFloat7;
                    objectAnimator3.setDuration(280);
                    objectAnimator3.setStartDelay(480);
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(requireViewById3, "scaleY", new float[]{1.0f, 0.0f});
                    ObjectAnimator objectAnimator4 = ofFloat8;
                    objectAnimator4.setDuration(280);
                    objectAnimator4.setStartDelay(480);
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(requireViewById3, "scaleX", new float[]{1.0f, 0.0f});
                    ofFloat9.setDuration(280);
                    ofFloat9.setStartDelay(480);
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(igImageView, "scaleY", new float[]{0.85f, 1.0f});
                    ofFloat10.setDuration(210);
                    ofFloat10.setStartDelay(760);
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(igImageView, "scaleX", new float[]{0.85f, 1.0f});
                    ofFloat11.setDuration(210);
                    ofFloat11.setStartDelay(760);
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(igImageView, "translationY", new float[]{0.0f});
                    ofFloat12.setDuration(210);
                    ofFloat12.setStartDelay(760);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.playTogether(new Animator[]{duration, ofFloat2, ofFloat, ofFloat4, ofFloat3});
                    AnimatorSet animatorSet3 = animatorSet2;
                    animatorSet3.setInterpolator(new AccelerateInterpolator());
                    animatorSet3.playTogether(new Animator[]{ofFloat7, ofFloat6, ofFloat5, ofFloat12, ofFloat11, ofFloat10, ofFloat9, ofFloat8});
                    animatorSet.start();
                    animatorSet2.start();
                    igImageView.post(new PWD(igImageView));
                    igImageViewArr = new IgImageView[2];
                    igImageViewArr[0] = igImageView;
                }
                igImageViewArr[1] = requireViewById3;
                return 0sr.A1P(igImageViewArr);
            }
        }
        return null;
    }

    public static final void A03(LayoutInflater layoutInflater, LinearLayout linearLayout, LinearLayout linearLayout2, AnonymousClass0iw r18, List list, boolean z) {
        IgImageView inflate;
        LinearLayout linearLayout3 = linearLayout;
        0qQ.A0B(linearLayout3, 0);
        LinearLayout linearLayout4 = linearLayout2;
        0qQ.A0B(linearLayout4, 1);
        0qQ.A0B(layoutInflater, 2);
        List list2 = list;
        if (list2.isEmpty()) {
            linearLayout4.setVisibility(8);
            int childCount = linearLayout4.getChildCount();
            for (int i = 0; i < childCount; i++) {
                linearLayout4.getChildAt(i).setVisibility(8);
            }
            return;
        }
        AnonymousClass7CZ r11 = A00;
        linearLayout4.setVisibility(0);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        int childCount2 = linearLayout4.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = linearLayout4.getChildAt(i2);
            0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
            Object tag = childAt.getTag(R.id.direct_reactor);
            0qQ.A0C(tag, "null cannot be cast to non-null type kotlin.String");
            hashMap.put(tag, childAt);
            hashSet.add(childAt);
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ImageUrl imageUrl = (ImageUrl) list2.get(i3);
            if (hashMap.containsKey(imageUrl.getUrl())) {
                0u4.A00(hashSet).remove(hashMap.get(imageUrl.getUrl()));
            }
        }
        linearLayout4.removeAllViews();
        ArrayList arrayList = new ArrayList();
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 < size2) {
                ImageUrl imageUrl2 = (ImageUrl) list2.get(i4);
                if (!hashMap.containsKey(imageUrl2.getUrl())) {
                    if (!hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        inflate = (IgImageView) it.next();
                        it.remove();
                    } else {
                        inflate = layoutInflater.inflate(R.layout.reactors_avatar, linearLayout3, false);
                    }
                    if (inflate == null) {
                        break;
                    }
                } else {
                    String url = imageUrl2.getUrl();
                    inflate = (IgImageView) hashMap.get(url);
                    hashMap.remove(url);
                    if (inflate == null) {
                        break;
                    } else if (inflate.getVisibility() == 0) {
                        z2 = false;
                    }
                }
                linearLayout4.addView(inflate);
                inflate.setUrl(imageUrl2, r18);
                inflate.setTag(R.id.direct_reactor, imageUrl2.getUrl());
                if (z2) {
                    arrayList.add(inflate);
                }
                inflate.setVisibility(0);
                i4++;
            } else {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    IgImageView igImageView = (IgImageView) it2.next();
                    igImageView.A09();
                    igImageView.setVisibility(8);
                    linearLayout4.addView(igImageView);
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (z && arrayList != null) {
                    r11.A05(arrayList);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A04(View view, C329967Kx r5, boolean z) {
        int i;
        0qQ.A0B(view, 0);
        0qQ.A0B(r5, 2);
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (gradientDrawable != null) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            if (z) {
                i = r5.A0D;
                gradientDrawable.setColor(ColorStateList.valueOf(i));
            } else {
                gradientDrawable.setColor(ColorStateList.valueOf(r5.A0E));
                i = r5.A0F;
            }
            gradientDrawable.setStroke(dimensionPixelSize, i);
        }
    }

    public static final boolean A06(UserSession userSession, 2FW r4, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int intValue;
        0qQ.A0B(r4, 3);
        if (!z || z3 || !z2 || ((r4 != 2FW.A0W && r4 != 2FW.A1p && r4 != 2FW.A17 && r4 != 2FW.A1s && r4 != 2FW.A1w && r4 != 2FW.A1O && r4 != 2FW.A1S && r4 != 2FW.A1Z && r4 != 2FW.A1a && r4 != 2FW.A1z && r4 != 2FW.A1Y && r4 != 2FW.A1u && r4 != 2FW.A1E && r4 != 2FW.A0Q && r4 != 2FW.A20 && r4 != 2FW.A1e && r4 != 2FW.A1y && r4 != 2FW.A1T && r4 != 2FW.A19 && r4 != 2FW.A1t && r4 != 2FW.A1r && r4 != 2FW.A0t && r4 != 2FW.A1o && r4 != 2FW.A0M && r4 != 2FW.A1v && r4 != 2FW.A1D && r4 != 2FW.A0w && r4 != 2FW.A1x && r4 != 2FW.A0z && r4 != 2FW.A12 && r4 != 2FW.A11 && !z4) || z5 || num == null || (((intValue = num.intValue()) != 1003 && intValue != 47) || 182.A06(0Tu.A06, userSession, 36320266384842892L) || !182.A06(0Tu.A05, userSession, 36325871316907328L)))) {
            return false;
        }
        return true;
    }

    public static final ArrayList A01(LayoutInflater layoutInflater, LinearLayout linearLayout, LinearLayout linearLayout2, AnonymousClass0iw r19, UserSession userSession, ImageUrl imageUrl, List list, int i) {
        View inflate;
        boolean z;
        LinearLayout linearLayout3 = linearLayout2;
        linearLayout3.setVisibility(0);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        int childCount = linearLayout3.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout3.getChildAt(i2);
            0qQ.A0C(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            Object tag = childAt.getTag(R.id.direct_reaction_emoji);
            0qQ.A0C(tag, "null cannot be cast to non-null type kotlin.String");
            hashMap.put(tag, childAt);
            hashSet.add(childAt);
        }
        List list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ImageUrl imageUrl2 = (ImageUrl) list2.get(i3);
            if (hashMap.containsKey(imageUrl2.getUrl())) {
                0u4.A00(hashSet).remove(hashMap.get(imageUrl2.getUrl()));
            }
        }
        linearLayout3.removeAllViews();
        ArrayList arrayList = new ArrayList();
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ImageUrl imageUrl3 = (ImageUrl) list2.get(i4);
            if (hashMap.containsKey(imageUrl3.getUrl())) {
                String url = imageUrl3.getUrl();
                inflate = (View) hashMap.get(url);
                hashMap.remove(url);
                if (inflate != null) {
                    z = false;
                    if (inflate.getVisibility() != 0) {
                        z = true;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    inflate = (View) it.next();
                    it.remove();
                } else {
                    inflate = layoutInflater.inflate(i, linearLayout, false);
                    0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                }
                z = true;
                if (inflate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            linearLayout3.addView(inflate);
            IgImageView requireViewById = inflate.requireViewById(R.id.emoji_image);
            0qQ.A07(requireViewById);
            String url2 = imageUrl3.getUrl();
            0qQ.A07(url2);
            requireViewById.setUrl(C336957fS.A00(C336957fS.A02(url2), url2), r19);
            Context context = inflate.getContext();
            0qQ.A07(context);
            inflate.setTag(R.id.direct_reaction_avatar_drawable, C59691JTy.A00(context, userSession, imageUrl));
            inflate.setContentDescription(url2);
            inflate.setTag(R.id.direct_reaction_emoji, url2);
            if (z) {
                arrayList.add(inflate);
            }
            inflate.setVisibility(0);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            IgImageView requireViewById2 = view.requireViewById(R.id.emoji_image);
            0qQ.A07(requireViewById2);
            requireViewById2.A09();
            view.setVisibility(8);
            linearLayout3.addView(view);
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    private final void A05(List list) {
        Drawable drawable;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setVisibility(4);
            Object tag = view.getTag(R.id.direct_reaction_avatar_drawable);
            if (!(tag instanceof Drawable) || (drawable = (Drawable) tag) == null || !(view instanceof ViewGroup)) {
                view.post(new PWE(view));
            } else {
                view.setVisibility(0);
                IgImageView requireViewById = view.requireViewById(R.id.emoji_image);
                0qQ.A07(requireViewById);
                IgImageView requireViewById2 = view.requireViewById(R.id.overlay_image);
                0qQ.A07(requireViewById2);
                View requireViewById3 = view.requireViewById(R.id.emoji_placeholder);
                0qQ.A07(requireViewById3);
                C71081Ob0.A00.A03(drawable, requireViewById3, requireViewById, requireViewById2);
            }
        }
    }
}
