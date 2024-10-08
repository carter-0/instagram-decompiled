package com.instagram.debug.devoptions.debughead.util;

import X.002;
import X.00k;
import X.0XK;
import X.0XY;
import X.0Xc;
import X.0eP;
import X.0eY;
import X.0fO;
import X.0qQ;
import X.0sr;
import X.0zn;
import X.19E;
import X.1Jn;
import X.AnonymousClass00P;
import X.AnonymousClass0Z1;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.C51967G9n;
import X.C51968G9o;
import X.C66581MXm;
import X.JTO;
import X.Pxe;
import X.RXC;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Environment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.CameraCapturer;

public final class ScreenshotQPLListener extends 0zn {
    public static final ScreenshotQPLListener INSTANCE = new Object();
    public static WeakReference activityRef = C51965G9l.A0v((Object) null);
    public static final HashMap cache = AnonymousClass7TE.A1E();
    public static final int[] markers = new int[0];
    public static final Map pointsAllowList = AnonymousClass7TF.A0w(15335435, C51967G9n.A0t(new String[]{"APP_ONCREATE_END", "ACTIVITY_ONCREATE_END", "FRAGMENT_RESUMED", "CACHED_FEED_END", "CACHED_STORIES_TRAY_END", "NETWORK_STORIES_TRAY_UI_RENDER_END", "NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END", "NETWORK_FEED_UI_RENDER_END", "CACHED_FEED_UI_RENDER_END", "FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_END", "STORIES_TRAY_POPULATED", "FIRST_MEDIA_LOAD_END"}, 0));
    public static final LruCache uxflowScreenshots = new LruCache(100);

    public final class ScreenshotData {
        public Bitmap bitmap;
        public String step;
        public final long timespent;
        public final long timestamp;
        public 1Jn uxEvent;

        public ScreenshotData(String str, long j, long j2) {
            0qQ.A0B(str, 1);
            this.step = str;
            this.timespent = j;
            this.timestamp = j2;
            0eP r1 = (0eP) ScreenshotQPLListener.uxflowScreenshots.get(Long.valueOf(j2));
            if (r1 != null) {
                this.uxEvent = (1Jn) r1.A00;
                this.bitmap = (Bitmap) r1.A01;
            }
            Bitmap bitmap2 = this.bitmap;
            this.bitmap = bitmap2 == null ? ScreenshotQPLListener.INSTANCE.takeScreenshot() : bitmap2;
        }

        public final void setStep(String str) {
            0qQ.A0B(str, 0);
            this.step = str;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final String getStep() {
            return this.step;
        }

        public final long getTimespent() {
            return this.timespent;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final 1Jn getUxEvent() {
            return this.uxEvent;
        }

        public final void setBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
        }

        public final void setUxEvent(1Jn r1) {
            this.uxEvent = r1;
        }
    }

    public String getName() {
        return "QPL_Screenshot";
    }

    public void onMarkerDrop(0XY r2) {
        0qQ.A0B(r2, 0);
        endRecording(r2, "marker_dropped");
    }

    public void onMarkerPoint(0XY r10, String str, 0XK r12, long j, long j2, boolean z, int i) {
        List A1B;
        Set set;
        String str2 = str;
        AnonymousClass7TG.A1N(r10, str);
        if ((r10.BTy() == 3359 || (set = (Set) C51968G9o.A10(pointsAllowList, r10.getMarkerId())) == null || set.contains(str)) && (A1B = Pxe.A1B(r10, cache)) != null) {
            A1B.add(new ScreenshotData(str2, j - r10.BU5(), j));
        }
    }

    public void onMarkerStart(0XY r9) {
        0qQ.A0B(r9, 0);
        cache.put(r9, 0sr.A1M(new ScreenshotData[]{new ScreenshotData("start", 0, r9.BU5())}));
    }

    public void onMarkerStop(0XY r3) {
        0qQ.A0B(r3, 0);
        endRecording(r3, 002.A0R("stop_", AnonymousClass0Z1.A00(r3.AYP())));
    }

    public final void setActivity(Activity activity) {
        0qQ.A0B(activity, 0);
        activityRef = C51965G9l.A0v(activity);
    }

    private final void endRecording(0XY r13, String str) {
        HashMap hashMap = cache;
        List A1B = Pxe.A1B(r13, hashMap);
        if (A1B != null) {
            String str2 = str;
            A1B.add(new ScreenshotData(str2, (long) r13.AzN(), ((long) r13.AzN()) + r13.BU5()));
        }
        List A1B2 = Pxe.A1B(r13, hashMap);
        if (A1B2 != null) {
            AnonymousClass7TE.A1Z(new ScreenshotQPLListener$endRecording$1$1(r13, A1B2, (AnonymousClass4D7) null), 19E.A02(AnonymousClass12T.A00.AOJ(1562465960, 3)));
        }
        hashMap.remove(r13);
    }

    /* access modifiers changed from: private */
    public final Bitmap takeScreenshot() {
        Activity activity = (Activity) activityRef.get();
        if (activity == null) {
            return null;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        View A0A = C66581MXm.A0A(activity);
        0qQ.A07(A0A);
        Bitmap createBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_4444);
        0qQ.A07(createBitmap);
        Canvas A0B = JTO.A0B(createBitmap);
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
        0qQ.A07(obtainStyledAttributes);
        activity.getResources().getDrawable(obtainStyledAttributes.getResourceId(0, 0)).draw(A0B);
        A0A.draw(A0B);
        return createBitmap;
    }

    public 0Xc getListenerMarkers() {
        int[] iArr = markers;
        return new 0Xc(Arrays.copyOf(iArr, iArr.length), (int[]) null);
    }

    private final void saveBitmapToDisk(Bitmap bitmap, File file, String str) {
        File A0s = JTO.A0s(file, str);
        try {
            FileOutputStream A0t = JTO.A0t(A0s);
            0fO.A02(Bitmap.CompressFormat.JPEG, bitmap, A0t, 60);
            A0t.flush();
            A0t.close();
            A0s.getAbsolutePath();
        } catch (IOException e) {
            A0s.getAbsolutePath();
            e.getMessage();
        }
    }

    /* access modifiers changed from: private */
    public final void saveToDisk(0XY r21, List list) {
        String A00 = RXC.A00(r21.getMarkerId());
        File A002 = 0eY.A00(Environment.DIRECTORY_PICTURES);
        0qQ.A07(A002);
        File A0s = JTO.A0s(A002, "qpl_screenshots");
        A0s.mkdirs();
        Bitmap bitmap = ((ScreenshotData) 00k.A0K(list)).bitmap;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight() + CameraCapturer.OPEN_CAMERA_DELAY_MS;
            Bitmap.Config config = bitmap.getConfig();
            0qQ.A0A(config);
            Bitmap createBitmap = Bitmap.createBitmap(list.size() * width, height, config);
            0qQ.A07(createBitmap);
            Canvas A0B = JTO.A0B(createBitmap);
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(-1);
            Paint.Style style = Paint.Style.FILL;
            textPaint.setStyle(style);
            textPaint.setTextSize(100.0f);
            A0B.drawText(A00, 110.0f, 110.0f, textPaint);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(-1);
            textPaint2.setStyle(style);
            textPaint2.setTextSize(70.0f);
            TextPaint textPaint3 = new TextPaint();
            textPaint3.setColor(-1);
            textPaint3.setStyle(style);
            textPaint3.setTextSize(60.0f);
            TextPaint textPaint4 = new TextPaint();
            textPaint4.setColor(-1);
            textPaint4.setStyle(style);
            textPaint4.setTextSize(40.0f);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                ScreenshotData screenshotData = (ScreenshotData) next;
                float f = ((float) (i * width)) + 10.0f;
                float textSize = textPaint.getTextSize() + 10.0f + textPaint2.getTextSize() + 10.0f;
                A0B.drawText(002.A0A(screenshotData.timespent, "ms"), f, textSize, textPaint2);
                float textSize2 = textSize + 10.0f + textPaint3.getTextSize() + 10.0f;
                A0B.drawText(screenshotData.step, f, textSize2, textPaint3);
                float f2 = textSize2 + 10.0f;
                Bitmap bitmap2 = screenshotData.bitmap;
                if (bitmap2 != null) {
                    A0B.drawBitmap(bitmap2, ((float) i) * ((float) width), f2, (Paint) null);
                    1Jn r1 = screenshotData.uxEvent;
                    if (r1 != null) {
                        String obj = r1.toString();
                        StaticLayout build = StaticLayout.Builder.obtain(obj, 0, obj.length(), textPaint4, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).build();
                        0qQ.A07(build);
                        A0B.save();
                        A0B.translate(f, f2 + JTO.A01(bitmap2) + 10.0f);
                        build.draw(A0B);
                        A0B.restore();
                    }
                }
                i = i2;
            }
            saveBitmapToDisk(createBitmap, A0s, 002.A0R(A00, ".jpg"));
        }
    }
}
