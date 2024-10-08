package com.instagram.igds.components.faceswarm;

import X.00k;
import X.0eP;
import X.0nA;
import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22027Xta;
import X.C240923Ne;
import X.C244303ay;
import X.C376699Iz;
import X.C51966G9m;
import X.C51969G9p;
import X.C53338GmO;
import X.C54654HMl;
import X.DbS;
import X.GNY;
import X.HMS;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IgdsFaceSwarmDrawable extends Drawable implements Drawable.Callback {
    public final AnonymousClass0iw analyticsModule;
    public final Paint bitmapPaint = AnonymousClass7TE.A0V(3);
    public Bitmap cachedBitmap;
    public final Context context;
    public float customFaceSwarmSizeDp = 72.0f;
    public final ArrayList drawables = AnonymousClass7TE.A1C();
    public float faceSwarmScaleRatio = 1.0f;
    public List items = AnonymousClass7TE.A1C();
    public int maxFaceSwarmItems = 4;
    public int preferredFourItemTemplateIndex;
    public int preferredThreeItemTemplateIndex;
    public int size = -1;
    public GNY template;

    public void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        GNY gny = this.template;
        if (gny != null) {
            Bitmap bitmap = this.cachedBitmap;
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                this.cachedBitmap = bitmap;
                if (bitmap == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            bitmap.eraseColor(0);
            Canvas canvas2 = new Canvas(bitmap);
            int size2 = this.drawables.size();
            int i = this.maxFaceSwarmItems;
            if (size2 > i) {
                size2 = i;
            }
            for (int i2 = 0; i2 < size2; i2++) {
                canvas2.save();
                Object obj = this.drawables.get(i2);
                0qQ.A07(obj);
                Context context2 = this.context;
                Point point = ((C53338GmO) C51966G9m.A19(gny.A01, i2)).A02;
                canvas2.translate(0nA.A04(context2, point.x), 0nA.A04(this.context, point.y));
                ((Drawable) obj).draw(canvas2);
                canvas2.restore();
            }
            canvas.drawBitmap(bitmap, (float) getBounds().left, (float) getBounds().top, this.bitmapPaint);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        int width = rect.width();
        int height = rect.height();
        if (width > height) {
            width = height;
        }
        if (width != this.size) {
            this.size = width;
            this.faceSwarmScaleRatio = (((float) this.size) * 1.0f) / ((float) ((int) 0nA.A00(this.context, 72.0f)));
            setup();
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setCustomSizeDp(int i) {
        this.customFaceSwarmSizeDp = (float) i;
    }

    public final void setFaceSwarmItems(List list, AnonymousClass0iw r3) {
        0qQ.A0B(list, 0);
        this.items = list;
        setup();
    }

    public final void setPreferredFourItemTemplate(C54654HMl hMl) {
        0qQ.A0B(hMl, 0);
        this.preferredFourItemTemplateIndex = hMl.A00;
    }

    public final void setPreferredThreeItemTemplate(HMS hms) {
        0qQ.A0B(hms, 0);
        this.preferredThreeItemTemplateIndex = hms.A00;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void setup() {
        Drawable drawable;
        0eP A00 = C240923Ne.A00(this.customFaceSwarmSizeDp, false, false);
        this.faceSwarmScaleRatio = AnonymousClass7TE.A04(A00.A00);
        this.maxFaceSwarmItems = C51969G9p.A0A(A00);
        this.drawables.clear();
        if (AnonymousClass7TE.A1b(this.items) && this.size > -1) {
            this.template = C22027Xta.A00(this.faceSwarmScaleRatio, 00k.A0d(this.items, this.maxFaceSwarmItems).size(), this.preferredThreeItemTemplateIndex, this.preferredFourItemTemplateIndex, 0);
            int size2 = this.items.size();
            int i = this.maxFaceSwarmItems;
            if (size2 > i) {
                size2 = i;
            }
            int i2 = 0;
            while (i2 < size2) {
                C376699Iz r4 = (C376699Iz) this.items.get(i2);
                Context context2 = this.context;
                GNY gny = this.template;
                if (gny != null) {
                    int A02 = DbS.A02(context2, (int) ((C53338GmO) C51966G9m.A19(gny.A01, i2)).A00);
                    ImageUrl imageUrl = (ImageUrl) r4.A01;
                    if (imageUrl != null) {
                        drawable = new C244303ay(imageUrl, this.analyticsModule.getModuleName(), A02, 0, 0, 0);
                        drawable.setCallback(this);
                    } else {
                        drawable = (Drawable) r4.A00;
                        if (drawable != null) {
                            drawable.setCallback(this);
                            drawable.setBounds(0, 0, A02, this.size);
                        } else {
                            i2++;
                        }
                    }
                    this.drawables.add(drawable);
                    i2++;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        invalidateSelf();
    }

    public final AnonymousClass0iw getAnalyticsModule() {
        return this.analyticsModule;
    }

    public final Context getContext() {
        return this.context;
    }

    public void setAlpha(int i) {
        Iterator A1G = AnonymousClass7TE.A1G(this.drawables);
        while (A1G.hasNext()) {
            ((Drawable) AnonymousClass7TF.A0a(A1G)).setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Iterator A1G = AnonymousClass7TE.A1G(this.drawables);
        while (A1G.hasNext()) {
            ((Drawable) AnonymousClass7TF.A0a(A1G)).setColorFilter(colorFilter);
        }
    }

    public IgdsFaceSwarmDrawable(Context context2, AnonymousClass0iw r3) {
        AnonymousClass7TG.A1O(context2, r3);
        this.context = context2;
        this.analyticsModule = r3;
    }

    public final void setImageUrls(List list, AnonymousClass0iw r8) {
        AnonymousClass7TG.A1N(list, r8);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new C376699Iz((Drawable) null, (ImageUrl) it.next(), (String) null, 6));
        }
        setFaceSwarmItems(A0r, r8);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
