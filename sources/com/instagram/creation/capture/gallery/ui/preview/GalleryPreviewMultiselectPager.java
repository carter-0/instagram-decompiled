package com.instagram.creation.capture.gallery.ui.preview;

import X.00k;
import X.0fE;
import X.0qQ;
import X.0sn;
import X.AnonymousClass3TG;
import X.AnonymousClass4HC;
import X.AnonymousClass514;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C310586bI;
import X.C361538gO;
import X.C51968G9o;
import X.C60974JuW;
import X.C63845L9a;
import X.C66309MMs;
import X.C72239Oz7;
import X.JTT;
import X.KI8;
import X.KIK;
import X.L0D;
import X.M6K;
import X.MQD;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.Adapter;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GalleryPreviewMultiselectPager extends ReboundViewPager {
    public MQD A00;
    public Integer A01;
    public List A02;
    public final KI8 A03;
    public final C63845L9a A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPreviewMultiselectPager(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setGalleryItems(List list) {
        0qQ.A0B(list, 0);
        A01((UserSession) null, this, list);
    }

    public final void setPrerenderedImageData(GalleryItem galleryItem, Bitmap bitmap) {
        Integer num;
        Object obj;
        Integer num2;
        int i;
        0qQ.A0B(galleryItem, 0);
        Iterator it = this.A02.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C60974JuW) obj).A0B.A0A, galleryItem.A0A)) {
                break;
            }
        }
        C60974JuW juW = (C60974JuW) obj;
        if (juW != null) {
            Bitmap bitmap2 = juW.A02;
            if (bitmap2 == null || !bitmap2.sameAs(bitmap)) {
                Bitmap bitmap3 = juW.A02;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
                juW.A02 = bitmap;
                if (bitmap != null) {
                    num = Integer.valueOf(bitmap.getWidth());
                    num2 = Integer.valueOf(bitmap.getHeight());
                } else {
                    num2 = null;
                }
                if (!(0qQ.A0K(this.A01, num) || num == null || num2 == null)) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material) * 2;
                    int intValue = num.intValue();
                    int intValue2 = num2.intValue();
                    if (intValue <= intValue2) {
                        i = (int) ((((float) (intValue2 - dimensionPixelSize)) / ((float) intValue2)) * ((float) intValue));
                    } else {
                        i = intValue - dimensionPixelSize;
                    }
                    this.A0C = i;
                    this.A0J = new AnonymousClass4HC(i, (int) this.A00, 1.0f);
                    this.A03.A00 = i;
                    this.A01 = num;
                }
                A01((UserSession) null, this, (List) null);
            }
        }
    }

    public final void setVideoCropType(AnonymousClass514 r3) {
        0qQ.A0B(r3, 0);
        C63845L9a l9a = this.A04;
        if (l9a.A01 != r3) {
            l9a.A01 = r3;
            A01((UserSession) null, this, (List) null);
        }
    }

    private final List A00(UserSession userSession, List list) {
        Boolean bool;
        Object obj;
        Medium medium;
        ExifImageData exifImageData;
        Bitmap bitmap;
        Bitmap bitmap2;
        float[] fArr;
        List<GalleryItem> list2 = list;
        if (list == null) {
            List<C60974JuW> list3 = this.A02;
            ArrayList A0p = AnonymousClass7TF.A0p(list3);
            for (C60974JuW juW : list3) {
                A0p.add(juW.A0B);
            }
            list2 = A0p;
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
        for (GalleryItem galleryItem : list2) {
            Iterator it = this.A02.iterator();
            while (true) {
                bool = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C60974JuW) obj).A0B.A0A, galleryItem.A0A)) {
                    break;
                }
            }
            C60974JuW juW2 = (C60974JuW) obj;
            if (userSession != null) {
                RemoteMedia remoteMedia = galleryItem.A04;
                if (remoteMedia != null) {
                    medium = C361538gO.A00(userSession).A01(remoteMedia);
                } else {
                    medium = null;
                }
            } else {
                medium = null;
            }
            C63845L9a l9a = this.A04;
            boolean z = l9a.A04;
            float f = l9a.A00;
            Float f2 = l9a.A03;
            if (f2 == null || !galleryItem.A06()) {
                f2 = null;
            }
            Float f3 = l9a.A02;
            AnonymousClass514 r3 = l9a.A01;
            if (r3 == null || !galleryItem.A06()) {
                r3 = null;
            }
            if (juW2 != null) {
                bool = juW2.A05;
                exifImageData = juW2.A04;
                bitmap = juW2.A01;
                bitmap2 = juW2.A02;
                fArr = juW2.A09;
            } else {
                exifImageData = null;
                bitmap = null;
                bitmap2 = null;
                fArr = null;
            }
            AnonymousClass514 r18 = r3;
            GalleryItem galleryItem2 = galleryItem;
            A0p2.add(new C60974JuW(bitmap, bitmap2, medium, galleryItem2, r18, exifImageData, bool, f2, f3, fArr, f, z));
        }
        return A0p2;
    }

    public static final void A01(UserSession userSession, GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, List list) {
        KI8 ki8 = galleryPreviewMultiselectPager.A03;
        ki8.A03 = 00k.A0U(galleryPreviewMultiselectPager.A00(userSession, list));
        0fE.A00(ki8, -726944241);
        galleryPreviewMultiselectPager.A02 = galleryPreviewMultiselectPager.A00(userSession, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (X.0qQ.A0K(r2.A00, r5) == false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r6, int r7) {
        /*
            if (r7 < 0) goto L_0x0041
            X.KI8 r1 = r6.A03
            int r0 = r1.getCount()
            if (r7 > r0) goto L_0x0041
            java.util.List r0 = r1.A03
            java.lang.Object r5 = r0.get(r7)
        L_0x0010:
            int r4 = r6.getChildCount()
            r3 = 0
        L_0x0015:
            if (r3 >= r4) goto L_0x0043
            android.view.View r0 = r6.getChildAt(r3)
            java.lang.Object r2 = r0.getTag()
            boolean r0 = r2 instanceof X.KKY
            if (r0 == 0) goto L_0x003a
            X.KKY r2 = (X.KKY) r2
            if (r2 == 0) goto L_0x003a
            if (r5 == 0) goto L_0x0032
            X.JuW r0 = r2.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r2.A04
            if (r1 == 0) goto L_0x003d
            r0.A06()
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x003d:
            r0.A04()
            goto L_0x003a
        L_0x0041:
            r5 = 0
            goto L_0x0010
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager.A03(com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager, int):void");
    }

    public static /* synthetic */ void setGalleryItems$default(GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, List list, GalleryItem galleryItem, UserSession userSession, int i, Object obj) {
        if ((i & 2) != 0) {
            galleryItem = null;
        }
        if ((i & 4) != 0) {
            userSession = null;
        }
        galleryPreviewMultiselectPager.setGalleryItems(list, galleryItem, userSession);
    }

    public final C60974JuW getCurrentPreviewItemModel() {
        KI8 ki8 = this.A03;
        return (C60974JuW) ki8.A03.get(getCurrentDataIndex());
    }

    public final void setCropImageAspectRatio(float f) {
        C63845L9a l9a = this.A04;
        if (l9a.A00 != f) {
            l9a.A00 = f;
            A01((UserSession) null, this, (List) null);
        }
    }

    public final void setForcedMinZoom(Float f) {
        C63845L9a l9a = this.A04;
        if (!0qQ.A0J(l9a.A02, f)) {
            l9a.A02 = f;
            A01((UserSession) null, this, (List) null);
        }
    }

    public final void setVideoPreviewAspectRatio(float f) {
        C63845L9a l9a = this.A04;
        if (!0qQ.A0I(l9a.A03, f)) {
            l9a.A03 = Float.valueOf(f);
            l9a.A00 = f;
            A01((UserSession) null, this, (List) null);
        }
    }

    public final void setPlaceholderMediumForGalleryItem(GalleryItem galleryItem, Medium medium) {
        AnonymousClass7TG.A1N(galleryItem, medium);
        KI8 ki8 = this.A03;
        for (C60974JuW juW : ki8.A03) {
            if (0qQ.A0K(juW.A0B, galleryItem)) {
                juW.A03 = medium;
            }
        }
        0fE.A00(ki8, -396151704);
    }

    public final void setListener(MQD mqd) {
        this.A00 = mqd;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.Adapter, X.6bI, X.KI8] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = new C63845L9a(this);
        0sn r3 = 0sn.A00;
        this.A02 = r3;
        L0D l0d = new L0D(this);
        KIK kik = new KIK(this, 0);
        ? r1 = new C310586bI();
        r1.A02 = l0d;
        r1.A01 = kik;
        r1.A00 = -1;
        r1.A03 = r3;
        this.A03 = r1;
        setAdapter((Adapter) r1);
        setScrollMode(AnonymousClass3TG.WHEEL_OF_FORTUNE);
        setPageSpacing(AnonymousClass7TE.A01(getResources(), R.dimen.account_discovery_bottom_gap));
        A0M(10, false);
        A0P(new C72239Oz7(this, 1));
    }

    public final void setGalleryItems(List list, GalleryItem galleryItem, UserSession userSession) {
        0qQ.A0B(list, 0);
        A01(userSession, this, list);
        if (galleryItem != null) {
            KI8 ki8 = this.A03;
            C66309MMs mMs = new C66309MMs(galleryItem, 0);
            ListIterator A18 = C51968G9o.A18(ki8.A03);
            while (A18.hasPrevious()) {
                if (AnonymousClass7TE.A1a(mMs.invoke(A18.previous()))) {
                    int nextIndex = A18.nextIndex();
                    if (nextIndex >= 0 && nextIndex < ki8.getCount()) {
                        getHandler().post(new M6K(this, nextIndex));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public /* synthetic */ GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    public final void setGalleryItems(List list, GalleryItem galleryItem) {
        0qQ.A0B(list, 0);
        setGalleryItems(list, galleryItem, (UserSession) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
