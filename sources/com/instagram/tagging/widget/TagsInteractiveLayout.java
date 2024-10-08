package com.instagram.tagging.widget;

import X.0qQ;
import X.1Xj;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass4KJ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C294975nL;
import X.C315596kB;
import X.C363198jK;
import X.C363228jN;
import X.C60029Jdf;
import X.C60046JeE;
import X.C60762Jqt;
import X.C62106KaD;
import X.C62107KaE;
import X.C62108KaF;
import X.C62109KaG;
import X.C62565Khv;
import X.C62630Kj1;
import X.C65710LyQ;
import X.C65712LyS;
import X.C65931M4u;
import X.C71392co;
import X.DbU;
import X.JTO;
import X.JTT;
import X.JTU;
import X.LE7;
import X.LMz;
import X.LOQ;
import X.LSN;
import X.LTQ;
import X.MUJ;
import X.MVH;
import X.W6F;
import X.X76;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TagsInteractiveLayout extends TagsLayout implements AnonymousClass0iw, X76 {
    public float A00;
    public float A01;
    public long A02;
    public C62630Kj1 A03;
    public C60046JeE A04;
    public C60046JeE A05;
    public MUJ A06;
    public LE7 A07;
    public MVH A08;
    public ArrayList A09;
    public ArrayList A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public UserSession A0J;
    public PeopleTag A0K;
    public MediaTaggingInfo A0L;
    public final PointF A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final GestureDetector A0P = new GestureDetector(getContext(), new C60029Jdf(this));

    private void A00(Tag tag, boolean z) {
        Tag tag2 = tag;
        if (tag.A01() == C62630Kj1.PEOPLE) {
            PeopleTag peopleTag = (PeopleTag) tag2;
            MediaTaggingInfo mediaTaggingInfo = this.A0L;
            if (mediaTaggingInfo != null) {
                mediaTaggingInfo.A0B.add(peopleTag);
                mediaTaggingInfo.A0F.add(peopleTag);
            }
            if (z) {
                this.A08.A84(peopleTag.A07());
                DbU.A1V(peopleTag.A07(), this.A09);
            }
        } else {
            MediaTaggingInfo mediaTaggingInfo2 = this.A0L;
            if (mediaTaggingInfo2 != null) {
                mediaTaggingInfo2.A0C.add(tag);
            }
        }
        C60046JeE A022 = A02(this.A0J, (1Xj) null, tag2, (User) null, false, false, false, false);
        if (A022 instanceof C62107KaE) {
            ((C62107KaE) A022).A06 = new C65712LyS(this);
        }
        if (A022 instanceof C62108KaF) {
            ((C62108KaF) A022).A04 = new C65710LyQ(this);
        }
        AVW();
    }

    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            C60046JeE jeE = (C60046JeE) getChildAt(i);
            Tag tag = (Tag) jeE.getTag();
            if (tag != null && tag.A01() == C62630Kj1.SUGGESTED_PRODUCT && !jeE.A04) {
                jeE.startAnimation(alphaAnimation);
                jeE.A04 = true;
            }
        }
        A03();
    }

    public final void AVW() {
        this.A01 = true;
        removeView(this.A05);
        this.A05 = null;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            C60046JeE jeE = (C60046JeE) getChildAt(i);
            Tag tag = (Tag) jeE.getTag();
            if (!(this.A03 == C62630Kj1.PEOPLE && tag != null && tag.A01() == C62630Kj1.SUGGESTED_PRODUCT) && !jeE.A04) {
                jeE.startAnimation(alphaAnimation);
                jeE.A04 = true;
            }
        }
        this.A08.DqQ(this.A0K);
    }

    public String getModuleName() {
        return "tags_interactive_layout";
    }

    public class UnnamedTagSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new W6F(73);
        public PointF A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.A00.x);
            parcel.writeFloat(this.A00.y);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static void A01(TagsInteractiveLayout tagsInteractiveLayout, Product product, boolean z) {
        boolean z2;
        String str;
        PointF pointF;
        C60046JeE jeE = tagsInteractiveLayout.A05;
        if (jeE != null) {
            Iterator it = tagsInteractiveLayout.A0B.iterator();
            while (it.hasNext()) {
                if (JTU.A0Y(it).equals(product.A0H)) {
                    tagsInteractiveLayout.AVW();
                    return;
                }
            }
            Iterator it2 = tagsInteractiveLayout.A0C.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it2.next();
                if (z && mediaSuggestedProductTag.A07() != null && JTT.A0n(mediaSuggestedProductTag).equals(product.A0H) && !mediaSuggestedProductTag.A09() && mediaSuggestedProductTag.A01 != C62565Khv.AUTO_TAG) {
                    z2 = true;
                    break;
                }
            }
            if (!tagsInteractiveLayout.A0C.isEmpty()) {
                Iterator it3 = tagsInteractiveLayout.A0C.iterator();
                boolean z3 = false;
                while (it3.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag2 = (MediaSuggestedProductTag) it3.next();
                    C60046JeE jeE2 = tagsInteractiveLayout.A05;
                    if (jeE2 == null || (pointF = mediaSuggestedProductTag2.A00) == null || !pointF.equals(C60046JeE.A01(jeE2).A06)) {
                        if (!mediaSuggestedProductTag2.A09() || mediaSuggestedProductTag2.A07() == null || !JTT.A0n(mediaSuggestedProductTag2).equals(product.A0H)) {
                            if (z && mediaSuggestedProductTag2.A07() != null && JTT.A0n(mediaSuggestedProductTag2).equals(product.A0H) && !mediaSuggestedProductTag2.A09()) {
                                if (!z3) {
                                    tagsInteractiveLayout.A08.Dp9(mediaSuggestedProductTag2, product, z);
                                    z3 = true;
                                }
                                tagsInteractiveLayout.A08.DqQ((PeopleTag) null);
                                it3.remove();
                            }
                        }
                    } else if (mediaSuggestedProductTag2.A09() && !z3) {
                        tagsInteractiveLayout.A08.Dp9(mediaSuggestedProductTag2, product, z);
                        z3 = true;
                    }
                    tagsInteractiveLayout.removeView(tagsInteractiveLayout.findViewWithTag(mediaSuggestedProductTag2));
                    tagsInteractiveLayout.A08.DqQ((PeopleTag) null);
                    it3.remove();
                }
            }
            PointF pointF2 = C60046JeE.A01(jeE).A06;
            ? obj = new Object();
            obj.A03 = null;
            obj.A01 = null;
            obj.A00 = pointF2;
            obj.A02 = product.A01;
            if (!z) {
                str = C62565Khv.AUTO_PLACE.A00;
            } else {
                if (z2) {
                    str = "low_confidence";
                }
                tagsInteractiveLayout.A00(obj, false);
            }
            obj.A03 = str;
            tagsInteractiveLayout.A00(obj, false);
        }
    }

    public final void A05(C60046JeE jeE) {
        float f;
        float f2;
        if (jeE != null && this.A0G) {
            LE7 le7 = this.A07;
            if (le7.A00(C60046JeE.A01(jeE).A0B)) {
                Rect rect = C60046JeE.A01(jeE).A0B;
                PointF pointF = C60046JeE.A01(jeE).A07;
                AnonymousClass7TG.A1N(rect, pointF);
                int i = rect.right;
                int i2 = rect.left;
                int i3 = i - i2;
                int i4 = rect.bottom;
                int i5 = rect.top;
                int i6 = i4 - i5;
                int i7 = le7.A01;
                if (i2 < i7) {
                    f = ((float) i7) + (((float) i3) / 2.0f);
                } else {
                    int i8 = le7.A02;
                    if (i > i8) {
                        f = ((float) i8) - (((float) i3) / 2.0f);
                    } else {
                        f = pointF.x;
                    }
                }
                int i9 = le7.A03;
                if (i5 < i9) {
                    f2 = (float) i9;
                } else {
                    int i10 = le7.A00;
                    if (i4 > i10) {
                        f2 = ((float) i10) - ((float) i6);
                    } else {
                        f2 = pointF.y;
                    }
                }
                jeE.setPosition(new PointF(f, f2));
                jeE.A05();
                C363228jN[] r4 = le7.A06;
                int i11 = 0;
                do {
                    r4[i11].A00 = false;
                    i11++;
                } while (i11 < 4);
            }
        }
    }

    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            C60046JeE jeE = (C60046JeE) getChildAt(i);
            Tag tag = (Tag) jeE.getTag();
            if (tag != null && tag.A01() == C62630Kj1.SUGGESTED_PRODUCT && jeE.A04) {
                jeE.setAnimation(alphaAnimation);
                jeE.A04 = false;
            }
        }
        A03();
    }

    public final void A08(PointF pointF) {
        PointF pointF2;
        C60046JeE kaG;
        String str;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
        alphaAnimation.setFillAfter(true);
        int i = 0;
        while (true) {
            pointF2 = pointF;
            if (i >= getChildCount()) {
                break;
            }
            if (C60046JeE.A01((C60046JeE) getChildAt(i)).A06 == pointF) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setFillAfter(true);
            }
            C60046JeE jeE = (C60046JeE) getChildAt(i);
            if (jeE.A04) {
                jeE.setAnimation(alphaAnimation);
                jeE.A04 = false;
            }
            i++;
        }
        this.A01 = false;
        C62630Kj1 kj1 = this.A03;
        String string = getResources().getString(2131969349);
        UserSession userSession = this.A0J;
        if (kj1 == C62630Kj1.PEOPLE) {
            kaG = new C62107KaE(getContext(), pointF2, userSession, (1Xj) null, false);
        } else if (kj1 == C62630Kj1.FB_USER_TAG) {
            kaG = new C62108KaF(getContext(), pointF2, userSession, (1Xj) null, false);
        } else {
            C62630Kj1 kj12 = C62630Kj1.SUGGESTED_PRODUCT;
            Context context = getContext();
            if (kj1 == kj12) {
                kaG = new C62106KaD(context, pointF2, userSession, (1Xj) null, true);
            } else {
                kaG = new C62109KaG(context, pointF2, userSession, (1Xj) null, (ImageInfo) null, (ImageInfo) null, false, (Boolean) null, false);
                kaG.setVisibility(8);
            }
        }
        kaG.setText(string);
        this.A05 = kaG;
        if (kaG instanceof C62107KaE) {
            ((C62107KaE) kaG).A06 = new C65712LyS(this);
        }
        addView(kaG);
        TaggingActivity taggingActivity = (TaggingActivity) this.A08;
        0qQ.A0B(pointF, 0);
        TaggingActivity.A0A(taggingActivity);
        LMz lMz = taggingActivity.A0G;
        if (lMz == null) {
            str = "taggingTypeIndicatorController";
        } else {
            lMz.A01.setVisibility(8);
            lMz.A02.setVisibility(0);
            ImageView imageView = lMz.A03;
            C71392co r0 = C315596kB.A02;
            C294975nL.A01(imageView, 0).A0G();
            lMz.A00.removeCallbacks(lMz.A05);
            LSN lsn = taggingActivity.A0E;
            if (lsn == null) {
                str = "helpTextController";
            } else {
                lsn.A03(false, AnonymousClass7TF.A1V(taggingActivity.A0D));
                PhotoScrollView photoScrollView = taggingActivity.A0I;
                if (photoScrollView != null) {
                    photoScrollView.setScrollTarget(pointF.y);
                }
                if (this.A0G) {
                    post(new C65931M4u(this));
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09(Tag tag) {
        String str;
        String str2;
        Tag tag2 = tag;
        C62630Kj1 A012 = tag2.A01();
        if (A012 == C62630Kj1.PEOPLE) {
            MediaTaggingInfo mediaTaggingInfo = this.A0L;
            if (mediaTaggingInfo != null) {
                this.A0K = null;
                PeopleTag peopleTag = (PeopleTag) tag2;
                0qQ.A0B(peopleTag, 0);
                mediaTaggingInfo.A0B.remove(peopleTag);
                TaggingActivity taggingActivity = (TaggingActivity) this.A08;
                String id = peopleTag.A07().getId();
                TaggingActivity.A0O(taggingActivity, peopleTag.A07());
                if (TaggingActivity.A0S(taggingActivity)) {
                    List list = taggingActivity.A0O;
                    str = "taggedSellerIds";
                    if (list != null) {
                        if (list.contains(id)) {
                            List list2 = taggingActivity.A0O;
                            if (list2 != null) {
                                list2.remove(id);
                                List list3 = taggingActivity.A0O;
                                if (list3 != null) {
                                    if (list3.isEmpty()) {
                                        TaggingActivity.A0H(taggingActivity);
                                    }
                                    TaggingActivity.A0D(taggingActivity);
                                }
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            this.A09.remove(tag2.getId());
        } else {
            C62630Kj1 kj1 = C62630Kj1.FB_USER_TAG;
            MediaTaggingInfo mediaTaggingInfo2 = this.A0L;
            if (A012 == kj1) {
                if (mediaTaggingInfo2 != null) {
                    mediaTaggingInfo2.A0A.remove(tag2);
                }
            } else if (mediaTaggingInfo2 != null) {
                ProductTag productTag = (ProductTag) tag2;
                0qQ.A0B(productTag, 0);
                mediaTaggingInfo2.A0C.remove(productTag);
                ProductAutoTagMetadata productAutoTagMetadata = productTag.A01;
                if (productAutoTagMetadata != null) {
                    TaggingActivity taggingActivity2 = (TaggingActivity) this.A08;
                    UserSession A0l = AnonymousClass7TE.A0l(taggingActivity2.A0o);
                    String str3 = taggingActivity2.A0K;
                    if (str3 == null) {
                        str = "_shoppingCreationSessionId";
                    } else {
                        boolean z = !TaggingActivity.A0U(taggingActivity2);
                        int i = taggingActivity2.A00;
                        String str4 = JTO.A0q(productTag).A0H;
                        String str5 = JTO.A0q(productTag).A0H;
                        Float f = productAutoTagMetadata.A01;
                        PointF pointF = productAutoTagMetadata.A00;
                        C60762Jqt A022 = TaggingActivity.A02(taggingActivity2);
                        C62565Khv khv = C62565Khv.AUTO_TAG;
                        String str6 = taggingActivity2.A0L;
                        if (str6 == null) {
                            str = "priorSubmodule";
                        } else {
                            if (TaggingActivity.A0S(taggingActivity2)) {
                                str2 = "opt";
                            } else {
                                str2 = "seller";
                            }
                            LTQ.A04(pointF, A022, taggingActivity2, A0l, khv, f, (Integer) null, str3, "remove", str4, str5, str6, "feed", str2, i, z);
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        removeView(findViewWithTag(tag2));
    }

    public final void AAN(User user, boolean z) {
        C60046JeE jeE = this.A05;
        if (jeE != null) {
            PeopleTag peopleTag = new PeopleTag(C60046JeE.A01(jeE).A06, user);
            this.A0K = peopleTag;
            peopleTag.A09(user);
            A00(peopleTag, z);
        }
    }

    public ArrayList getSuggestedProductTags() {
        return this.A0C;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = i4;
        super.onLayout(z, i, i2, i3, i4);
        if (((double) AnonymousClass7TE.A00(((float) (i3 - i)) / ((float) (i4 - i2)), 0.5625f)) < 0.01d) {
            Rect rect = this.A0O;
            rect.set(i, i2, i3, i5);
            LE7 le7 = this.A07;
            Rect rect2 = le7.A04;
            if (!0qQ.A0K(rect2, rect)) {
                rect2.set(rect);
                int i6 = rect.right;
                int i7 = rect.left;
                int i8 = rect.bottom;
                int i9 = rect.top;
                int i10 = (int) (((float) (i6 - i7)) * 0.055f);
                float f = (float) (i8 - i9);
                int i11 = (int) (0.15f * f);
                int i12 = (int) (f * 0.25f);
                le7.A01 = i7 + i10;
                le7.A02 = i6 - i10;
                le7.A03 = i9 + i11;
                le7.A00 = i8 - i12;
                C363198jK[] r3 = le7.A05;
                for (int i13 = 0; i13 < 4; i13++) {
                    C363198jK r0 = r3[i13];
                    r0.A03(rect2);
                    r0.A01 = true;
                }
                r3[0].A06.A00(i10, 0, 0, 0);
                r3[1].A06.A00(0, 0, i10, 0);
                r3[2].A06.A00(0, i11, 0, 0);
                r3[3].A06.A00(0, 0, 0, i12);
                C363228jN[] r7 = le7.A06;
                C363228jN r02 = r7[0];
                r02.A01.setBounds(rect2.left, rect2.top, le7.A01, rect2.bottom);
                C363228jN r03 = r7[1];
                r03.A01.setBounds(le7.A02, rect2.top, rect2.right, rect2.bottom);
                C363228jN r04 = r7[2];
                r04.A01.setBounds(rect2.left, rect2.top, rect2.right, le7.A03);
                C363228jN r05 = r7[3];
                r05.A01.setBounds(rect2.left, le7.A00, rect2.right, rect2.bottom);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.A0G = z2;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof UnnamedTagSavedState) {
            UnnamedTagSavedState unnamedTagSavedState = (UnnamedTagSavedState) parcelable;
            super.onRestoreInstanceState(unnamedTagSavedState.getSuperState());
            A08(unnamedTagSavedState.A00);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setEditingTagType(C62630Kj1 kj1) {
        this.A03 = kj1;
        if (kj1 == C62630Kj1.PRODUCT) {
            A07();
        } else if (!this.A0H) {
            A06();
        }
    }

    public void setSuggestedProductTags(ArrayList arrayList, boolean z, UserSession userSession) {
        this.A0C = arrayList;
        this.A0J = userSession;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!AnonymousClass4KJ.A00(arrayList)) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
                C62565Khv khv = mediaSuggestedProductTag.A01;
                if (khv == C62565Khv.AUTO_PLACE || khv == C62565Khv.SHOW_HINT) {
                    A1C.add(mediaSuggestedProductTag);
                }
            }
        }
        super.setTags(A1C, z, this.A0J);
    }

    public void setTags(MediaTaggingInfo mediaTaggingInfo, boolean z, UserSession userSession) {
        this.A0L = mediaTaggingInfo;
        this.A0A = mediaTaggingInfo.A0B;
        this.A0B = mediaTaggingInfo.A0C;
        this.A09 = AnonymousClass7TE.A1D(AnonymousClass7TE.A1D(mediaTaggingInfo.A0E));
        ArrayList arrayList = mediaTaggingInfo.A0D;
        if (arrayList != null) {
            this.A0C = arrayList;
        }
        this.A0J = userSession;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(this.A0A);
        A1C.addAll(this.A0B);
        if (LOQ.A00.A01(userSession, mediaTaggingInfo.A07, false)) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(mediaTaggingInfo.A0A);
            while (A1G.hasNext()) {
                FBUserTag fBUserTag = (FBUserTag) AnonymousClass7TF.A0a(A1G);
                if (fBUserTag.A01 == FBTagType.PHOTO_TAG) {
                    A1C2.add(fBUserTag);
                }
            }
            A1C.addAll(A1C2);
        }
        if (!AnonymousClass4KJ.A00(this.A0C)) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
                C62565Khv khv = mediaSuggestedProductTag.A01;
                if (khv == C62565Khv.AUTO_PLACE || khv == C62565Khv.SHOW_HINT) {
                    A1C.add(mediaSuggestedProductTag);
                }
            }
        }
        super.setTags(A1C, z, this.A0J);
    }

    public TagsInteractiveLayout(Context context) {
        super(context);
        boolean A1Y = JTU.A1Y(this);
        this.A0M = new PointF();
        this.A0O = AnonymousClass7TE.A0W();
        this.A0N = AnonymousClass7TE.A0W();
        setWillNotDraw(A1Y);
        this.A07 = new LE7(context);
    }

    public final void A0A(List list) {
        for (Object findViewWithTag : list) {
            removeView(findViewWithTag(findViewWithTag));
        }
        this.A0C.clear();
        this.A08.DqQ((PeopleTag) null);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0G) {
            LE7 le7 = this.A07;
            0qQ.A0B(canvas, 0);
            C363198jK[] r3 = le7.A05;
            int i = 0;
            int i2 = 0;
            do {
                r3[i2].A02(canvas);
                i2++;
            } while (i2 < 4);
            C363228jN[] r32 = le7.A06;
            do {
                C363228jN r1 = r32[i];
                if (r1.A00) {
                    r1.A01.draw(canvas);
                }
                i++;
            } while (i < 4);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState] */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.A05 == null) {
            return onSaveInstanceState;
        }
        ? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.A00 = C60046JeE.A01(this.A05).A06;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-212043952);
        int action = motionEvent.getAction();
        C60046JeE jeE = this.A04;
        if (jeE != null && (action == 1 || action == 3)) {
            A05(jeE);
            MVH mvh = this.A08;
            PointF pointF = C60046JeE.A01(jeE).A06;
            0qQ.A0B(pointF, 0);
            PhotoScrollView photoScrollView = ((TaggingActivity) mvh).A0I;
            if (photoScrollView != null) {
                photoScrollView.setScrollTarget(pointF.y);
            }
            if (jeE.getTag() != null) {
                ((Tag) jeE.getTag()).A00 = C60046JeE.A01(jeE).A06;
            }
        }
        boolean onTouchEvent = this.A0P.onTouchEvent(motionEvent);
        if (this.A0G && (!(this.A04 == null && this.A05 == null) && (action == 1 || action == 3))) {
            C363198jK[] r3 = this.A07.A05;
            int i = 0;
            do {
                r3[i].A00();
                i++;
            } while (i < 4);
            invalidate();
        }
        AnonymousClass0fD.A0C(697980870, A052);
        return onTouchEvent;
    }

    public void setDisableRemovingCollabs(boolean z) {
        this.A0D = z;
    }

    public void setDisableRemovingTags(boolean z) {
        this.A0E = z;
    }

    public void setListener(MVH mvh) {
        this.A08 = mvh;
    }

    public void setShouldShowSuggestedProductsOnPeopleTab(boolean z) {
        this.A0H = z;
    }

    public void setTaggingEditProvider(MUJ muj) {
        this.A06 = muj;
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean A1Y = JTU.A1Y(this);
        this.A0M = new PointF();
        this.A0O = AnonymousClass7TE.A0W();
        this.A0N = AnonymousClass7TE.A0W();
        setWillNotDraw(A1Y);
        this.A07 = new LE7(context);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean A1Y = JTU.A1Y(this);
        this.A0M = new PointF();
        this.A0O = AnonymousClass7TE.A0W();
        this.A0N = AnonymousClass7TE.A0W();
        setWillNotDraw(A1Y);
        this.A07 = new LE7(context);
    }
}
