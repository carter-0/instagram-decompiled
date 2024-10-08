package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.instagram.android.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;

public final class QAQ extends C3021161q {
    public static final C13516Tbl A0D = new C11777SgP();
    public int A00 = 0;
    public C13516Tbl A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public int A04;
    public SSQ A05;
    public String A06;
    public boolean A07 = false;
    public final Q6Y A08 = new Q6Y();
    public final Set A09 = AnonymousClass7TE.A1F();
    public final C13516Tbl A0A = new C11779SgR(this);
    public final C13516Tbl A0B = new C11778SgQ(this);
    public final Set A0C = AnonymousClass7TE.A1F();

    public QAQ(Context context) {
        super(context, (AttributeSet) null, 0);
        String string;
        Context context2 = getContext();
        boolean z = false;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes((AttributeSet) null, C9896RjB.A00, R.attr.lottieAnimationViewStyle, 0);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        boolean hasValue2 = obtainStyledAttributes.hasValue(9);
        boolean hasValue3 = obtainStyledAttributes.hasValue(19);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(14, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw AnonymousClass7TE.A0w("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        this.A00 = obtainStyledAttributes.getResourceId(8, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A02 = true;
        }
        if (obtainStyledAttributes.getBoolean(12, false)) {
            this.A08.A0c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setRepeatMode(obtainStyledAttributes.getInt(17, 1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatCount(obtainStyledAttributes.getInt(16, -1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setSpeed(obtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(4, true));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(3, false));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(11));
        boolean hasValue4 = obtainStyledAttributes.hasValue(13);
        float f = obtainStyledAttributes.getFloat(13, 0.0f);
        if (hasValue4) {
            this.A09.add(RET.SET_PROGRESS);
        }
        Q6Y q6y = this.A08;
        q6y.A0B(f);
        boolean z2 = obtainStyledAttributes.getBoolean(7, false);
        if (q6y.A0S != z2) {
            q6y.A0S = z2;
            if (q6y.A0G != null) {
                Q6Y.A03(q6y);
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            q6y.A0G(new SPM("**"), new SIR(new PorterDuffColorFilter(02K.A02(context2, obtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)), C13881Tj4.A01);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            int i = obtainStyledAttributes.getInt(15, 0);
            setRenderMode(C8874RDq.values()[i >= C8874RDq.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i2 = obtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(C8864RDf.values()[i2 >= C8874RDq.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(10, false));
        if (obtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(20, false));
        }
        obtainStyledAttributes.recycle();
        q6y.A0a = C66581MXm.A1a(Settings.Global.getFloat(context2.getContentResolver(), AnonymousClass000.A00(506), 1.0f) != 0.0f ? true : z);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C11425STh.A05(new C12855TAv(inputStream), str, new TNT(str, inputStream, 2)));
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageResource(i);
    }

    private void A00() {
        SSQ ssq = this.A05;
        if (ssq != null) {
            C13516Tbl tbl = this.A0A;
            synchronized (ssq) {
                ssq.A02.remove(tbl);
            }
            SSQ ssq2 = this.A05;
            C13516Tbl tbl2 = this.A0B;
            synchronized (ssq2) {
                ssq2.A01.remove(tbl2);
            }
        }
    }

    private void setCompositionTask(SSQ ssq) {
        SIM sim = ssq.A03;
        Q6Y q6y = this.A08;
        if (sim == null || q6y != getDrawable() || q6y.A0G != sim.A00) {
            this.A09.add(RET.SET_ANIMATION);
            q6y.A05();
            A00();
            ssq.A03(this.A0A);
            ssq.A02(this.A0B);
            this.A05 = ssq;
        }
    }

    public C8864RDf getAsyncUpdates() {
        C8864RDf rDf = this.A08.A0D;
        if (rDf == null) {
            return C10110Rmm.A00;
        }
        return rDf;
    }

    public boolean getAsyncUpdatesEnabled() {
        C8864RDf rDf = this.A08.A0D;
        if (rDf == null) {
            rDf = C10110Rmm.A00;
        }
        return AnonymousClass7TF.A1W(rDf, C8864RDf.ENABLED);
    }

    public boolean getClipTextToBoundingBox() {
        return this.A08.A0Q;
    }

    public boolean getClipToCompositionBounds() {
        return this.A08.A0R;
    }

    public int getFrame() {
        return (int) this.A08.A0c.A00;
    }

    public String getImageAssetsFolder() {
        return this.A08.A0O;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.A08.A0W;
    }

    public float getMaxFrame() {
        return this.A08.A0c.A01();
    }

    public float getMinFrame() {
        return this.A08.A0c.A02();
    }

    public C10653Rvn getPerformanceTracker() {
        S7N s7n = this.A08.A0G;
        if (s7n != null) {
            return s7n.A0D;
        }
        return null;
    }

    public float getProgress() {
        return this.A08.A0c.A00();
    }

    public C8874RDq getRenderMode() {
        if (this.A08.A0b) {
            return C8874RDq.SOFTWARE;
        }
        return C8874RDq.HARDWARE;
    }

    public int getRepeatCount() {
        return this.A08.A0c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A08.A0c.getRepeatMode();
    }

    public float getSpeed() {
        return this.A08.A0c.A04;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        this.A06 = lottieAnimationView$SavedState.A04;
        Set set = this.A09;
        RET ret = RET.SET_ANIMATION;
        if (!set.contains(ret) && !TextUtils.isEmpty(this.A06)) {
            setAnimation(this.A06);
        }
        this.A04 = lottieAnimationView$SavedState.A01;
        if (!set.contains(ret) && (i = this.A04) != 0) {
            setAnimation(i);
        }
        if (!set.contains(RET.SET_PROGRESS)) {
            this.A08.A0B(lottieAnimationView$SavedState.A00);
        }
        RET ret2 = RET.PLAY_OPTION;
        if (!set.contains(ret2) && lottieAnimationView$SavedState.A06) {
            set.add(ret2);
            this.A08.A07();
        }
        if (!set.contains(RET.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lottieAnimationView$SavedState.A05);
        }
        if (!set.contains(RET.SET_REPEAT_MODE)) {
            setRepeatMode(lottieAnimationView$SavedState.A03);
        }
        if (!set.contains(RET.SET_REPEAT_COUNT)) {
            setRepeatCount(lottieAnimationView$SavedState.A02);
        }
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.A08.A0U = z;
    }

    public void setAsyncUpdates(C8864RDf rDf) {
        this.A08.A0D = rDf;
    }

    public void setCacheComposition(boolean z) {
        this.A03 = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        Q6Y q6y = this.A08;
        if (z != q6y.A0Q) {
            q6y.A0Q = z;
            q6y.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        Q6Y q6y = this.A08;
        if (z != q6y.A0R) {
            q6y.A0R = z;
            C7492QGj qGj = q6y.A0L;
            if (qGj != null) {
                qGj.A01 = z;
            }
            q6y.invalidateSelf();
        }
    }

    public void setComposition(S7N s7n) {
        boolean z;
        Q6Y q6y = this.A08;
        q6y.setCallback(this);
        this.A07 = true;
        boolean A0K = q6y.A0K(s7n);
        if (this.A02) {
            q6y.A07();
        }
        this.A07 = false;
        if (getDrawable() == q6y) {
            if (!A0K) {
                return;
            }
        } else if (!A0K) {
            Q50 q50 = q6y.A0c;
            if (q50 == null) {
                z = false;
            } else {
                z = q50.A08;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(q6y);
            if (z) {
                q6y.A08();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.A0C.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onCompositionLoaded");
        }
    }

    public void setDefaultFontFileExtension(String str) {
        Q6Y q6y = this.A08;
        q6y.A0N = str;
        if (q6y.getCallback() != null) {
            C10766Rxk rxk = q6y.A0J;
            if (rxk == null) {
                rxk = new C10766Rxk(q6y.getCallback());
                q6y.A0J = rxk;
                String str2 = q6y.A0N;
                if (str2 != null) {
                    rxk.A01 = str2;
                }
            }
            rxk.A01 = str;
        }
    }

    public void setFailureListener(C13516Tbl tbl) {
        this.A01 = tbl;
    }

    public void setFallbackResource(int i) {
        this.A00 = i;
    }

    public void setFontAssetDelegate(RLK rlk) {
        Q6Y q6y = this.A08;
        q6y.A0E = rlk;
        C10766Rxk rxk = q6y.A0J;
        if (rxk != null) {
            rxk.A00 = rlk;
        }
    }

    public void setFontMap(Map map) {
        Q6Y q6y = this.A08;
        if (map != q6y.A0P) {
            q6y.A0P = map;
            q6y.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.A08.A0C(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.A08.A0T = z;
    }

    public void setImageAssetDelegate(TZo tZo) {
        Q6Y q6y = this.A08;
        q6y.A0F = tZo;
        SFI sfi = q6y.A0K;
        if (sfi != null) {
            sfi.A00 = tZo;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A08.A0O = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.A08.A0W = z;
    }

    public void setMaxFrame(int i) {
        this.A08.A0D(i);
    }

    public void setMaxProgress(float f) {
        this.A08.A09(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.A08.A0I(str);
    }

    public void setMinFrame(int i) {
        this.A08.A0E(i);
    }

    public void setMinProgress(float f) {
        this.A08.A0A(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        Q6Y q6y = this.A08;
        if (q6y.A0X != z) {
            q6y.A0X = z;
            C7492QGj qGj = q6y.A0L;
            if (qGj != null) {
                qGj.A0E(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        Q6Y q6y = this.A08;
        q6y.A0Y = z;
        S7N s7n = q6y.A0G;
        if (s7n != null) {
            s7n.A0D.A00 = z;
        }
    }

    public void setProgress(float f) {
        this.A09.add(RET.SET_PROGRESS);
        this.A08.A0B(f);
    }

    public void setRenderMode(C8874RDq rDq) {
        Q6Y q6y = this.A08;
        q6y.A0H = rDq;
        Q6Y.A04(q6y);
    }

    public void setRepeatCount(int i) {
        this.A09.add(RET.SET_REPEAT_COUNT);
        this.A08.A0c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.A09.add(RET.SET_REPEAT_MODE);
        this.A08.A0c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.A08.A0Z = z;
    }

    public void setSpeed(float f) {
        this.A08.A0c.A04 = f;
    }

    public void setTextDelegate(RLL rll) {
        this.A08.A0I = rll;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.A08.A0c.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r0.A08 != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x0016
            X.Q6Y r1 = r2.A08
            if (r3 != r1) goto L_0x001a
            X.Q50 r0 = r1.A0c
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x001a
            r0 = 0
            r2.A02 = r0
        L_0x0013:
            r1.A06()
        L_0x0016:
            super.unscheduleDrawable(r3)
            return
        L_0x001a:
            boolean r0 = r3 instanceof X.Q6Y
            if (r0 == 0) goto L_0x0016
            r1 = r3
            X.Q6Y r1 = (X.Q6Y) r1
            X.Q50 r0 = r1.A0c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0016
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAQ.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public S7N getComposition() {
        Drawable drawable = getDrawable();
        Q6Y q6y = this.A08;
        if (drawable == q6y) {
            return q6y.A0G;
        }
        return null;
    }

    public long getDuration() {
        S7N composition = getComposition();
        if (composition != null) {
            return (long) composition.A00();
        }
        return 0;
    }

    public final void invalidate() {
        C8874RDq rDq;
        int A032 = AnonymousClass0fD.A03(-212768766);
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof Q6Y) {
            if (((Q6Y) drawable).A0b) {
                rDq = C8874RDq.SOFTWARE;
            } else {
                rDq = C8874RDq.HARDWARE;
            }
            if (rDq == C8874RDq.SOFTWARE) {
                this.A08.invalidateSelf();
            }
        }
        AnonymousClass0fD.A0A(-1392944556, A032);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Q6Y q6y = this.A08;
        if (drawable2 == q6y) {
            super.invalidateDrawable(q6y);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1997867980);
        super.onAttachedToWindow();
        if (!isInEditMode() && this.A02) {
            this.A08.A07();
        }
        AnonymousClass0fD.A0D(461278712, A062);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.airbnb.lottie.LottieAnimationView$SavedState] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r1 == X.AnonymousClass05K.A0C) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$SavedState r5 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r5.<init>(r0)
            java.lang.String r0 = r6.A06
            r5.A04 = r0
            int r0 = r6.A04
            r5.A01 = r0
            X.Q6Y r4 = r6.A08
            X.Q50 r3 = r4.A0c
            float r0 = r3.A00()
            r5.A00 = r0
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L_0x0036
            boolean r2 = r3.A08
        L_0x0023:
            r5.A06 = r2
            java.lang.String r0 = r4.A0O
            r5.A05 = r0
            int r0 = r3.getRepeatMode()
            r5.A03 = r0
            int r0 = r3.getRepeatCount()
            r5.A02 = r0
            return r5
        L_0x0036:
            java.lang.Integer r1 = r4.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2 = 0
            if (r1 != r0) goto L_0x0023
        L_0x0041:
            r2 = 1
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAQ.onSaveInstanceState():android.os.Parcelable");
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation((InputStream) new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(C13159TNr.A00(getContext(), str, str2));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(C11425STh.A05(new C12856TAw(zipInputStream), str, new TNT(str, zipInputStream, 3)));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        SSQ ssq;
        boolean z = this.A03;
        Context context = getContext();
        if (z) {
            ssq = C13159TNr.A00(context, str, 002.A0R("url_", str));
        } else {
            ssq = new SSQ(new C13159TNr(context, str, (String) null, 1), false);
        }
        setCompositionTask(ssq);
    }

    public void setMaxFrame(String str) {
        this.A08.A0H(str);
    }

    public void setMinFrame(String str) {
        this.A08.A0J(str);
    }

    public void setAnimation(int i) {
        SSQ ssq;
        String str;
        int i2 = i;
        this.A04 = i;
        this.A06 = null;
        if (isInEditMode()) {
            Executor executor = SSQ.A04;
            ssq = new SSQ(new TNS(this, i, 0), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                if ((Pxf.A0G(context).uiMode & 48) == 32) {
                    str = "_night_";
                } else {
                    str = "_day_";
                }
                String A0b = 002.A0b("rawRes", str, i);
                ssq = C11425STh.A05((Runnable) null, A0b, new C13150TNi(context.getApplicationContext(), C51965G9l.A0v(context), A0b, i2, 0));
            } else {
                ssq = new SSQ(new C13150TNi(context.getApplicationContext(), C51965G9l.A0v(context), (String) null, i, 0), false);
            }
        }
        setCompositionTask(ssq);
    }

    public void setAnimation(String str) {
        SSQ ssq;
        this.A06 = str;
        this.A04 = 0;
        if (isInEditMode()) {
            Executor executor = SSQ.A04;
            ssq = new SSQ(new TNT(str, this, 1), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                String A0R = 002.A0R("asset_", str);
                ssq = C11425STh.A05((Runnable) null, A0R, new C13159TNr(context.getApplicationContext(), str, A0R, 0));
            } else {
                ssq = new SSQ(new C13159TNr(context.getApplicationContext(), str, (String) null, 0), false);
            }
        }
        setCompositionTask(ssq);
    }
}
