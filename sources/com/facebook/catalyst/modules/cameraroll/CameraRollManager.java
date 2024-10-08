package com.facebook.catalyst.modules.cameraroll;

import X.002;
import X.0I1;
import X.0cp;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13904TjR;
import X.C13948Tm8;
import X.C227922kK;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.QZ2;
import X.QZ3;
import X.QZK;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.location.platform.api.Location;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = "CameraRollManager")
public class CameraRollManager extends NativeCameraRollManagerSpec {
    public static final String ASSET_TYPE_ALL = "All";
    public static final String ASSET_TYPE_PHOTOS = "Photos";
    public static final String ASSET_TYPE_VIDEOS = "Videos";
    public static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    public static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    public static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    public static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final int IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL = 29;
    public static final String[] PROJECTION_LIST;
    public static final String SELECTION_BUCKET = "bucket_display_name = ?";
    public static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    public static final String SELECTION_MEDIA_SIZE = "_size < ?";

    static {
        ArrayList A0q = Pxf.A0q(new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "_size", "_data"});
        if (Build.VERSION.SDK_INT < 29) {
            A0q.add(Location.LATITUDE);
            A0q.add("longitude");
        }
        PROJECTION_LIST = Pxf.A1a(A0q, 0);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, C13948Tm8 tm8, int i) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Cursor cursor2 = cursor;
        cursor2.moveToFirst();
        int columnIndex = cursor2.getColumnIndex("_id");
        int columnIndex2 = cursor2.getColumnIndex("mime_type");
        int columnIndex3 = cursor2.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor2.getColumnIndex("datetaken");
        int columnIndex5 = cursor2.getColumnIndex(IgReactMediaPickerNativeModule.WIDTH);
        int columnIndex6 = cursor2.getColumnIndex(IgReactMediaPickerNativeModule.HEIGHT);
        int columnIndex7 = cursor2.getColumnIndex("_size");
        int columnIndex8 = cursor2.getColumnIndex("longitude");
        int columnIndex9 = cursor2.getColumnIndex(Location.LATITUDE);
        int columnIndex10 = cursor2.getColumnIndex("_data");
        int i2 = 0;
        while (i2 < i && !cursor2.isAfterLast()) {
            WritableNativeMap A0U = Pxe.A0U();
            WritableNativeMap A0U2 = Pxe.A0U();
            if (putImageInfo(contentResolver, cursor2, A0U2, columnIndex, columnIndex5, columnIndex6, columnIndex7, columnIndex10, columnIndex2)) {
                putBasicNodeInfo(cursor2, A0U2, columnIndex2, columnIndex3, columnIndex4);
                if (Build.VERSION.SDK_INT < 29) {
                    putLocationInfo(cursor2, A0U2, columnIndex8, columnIndex9);
                }
                A0U.putMap("node", A0U2);
                writableNativeArray.pushMap(A0U);
            } else {
                i2--;
            }
            cursor2.moveToNext();
            i2++;
        }
        tm8.putArray("edges", writableNativeArray);
    }

    public void getPhotos(ReadableMap readableMap, C13904TjR tjR) {
        String str;
        String str2;
        String str3;
        Integer num;
        int i = readableMap.getInt("first");
        ReadableArray readableArray = null;
        if (readableMap.hasKey("after")) {
            str = readableMap.getString("after");
        } else {
            str = null;
        }
        if (readableMap.hasKey("groupName")) {
            str2 = readableMap.getString("groupName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("assetType")) {
            str3 = readableMap.getString("assetType");
        } else {
            str3 = ASSET_TYPE_PHOTOS;
        }
        if (!readableMap.hasKey("maxSize") || readableMap.isNull("maxSize")) {
            num = null;
        } else {
            num = Integer.valueOf(readableMap.getInt("maxSize"));
        }
        if (readableMap.hasKey("mimeTypes")) {
            readableArray = readableMap.getArray("mimeTypes");
        }
        if (!readableMap.hasKey("groupTypes")) {
            new QZ3(tjR, Pxe.A0T(this), readableArray, num, str, str2, str3, i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new RuntimeException("groupTypes is not supported on Android");
    }

    public static void putBasicNodeInfo(Cursor cursor, C13948Tm8 tm8, int i, int i2, int i3) {
        tm8.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, cursor.getString(i));
        tm8.putString("group_name", cursor.getString(i2));
        tm8.putDouble("timestamp", ((double) cursor.getLong(i3)) / 1000.0d);
    }

    public static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, C13948Tm8 tm8, int i, int i2, int i3, int i4, int i5, int i6) {
        StringBuilder sb;
        String str;
        WritableNativeMap A0U = Pxe.A0U();
        Cursor cursor2 = cursor;
        int i7 = i5;
        Uri A03 = 0cp.A03(002.A0R("file://", cursor2.getString(i7)));
        File A0t = AnonymousClass7TE.A0t(cursor2.getString(i7));
        String name = A0t.getName();
        A0U.putString("uri", A03.toString());
        A0U.putString("filename", name);
        float f = (float) cursor2.getInt(i2);
        float f2 = (float) cursor2.getInt(i3);
        long j = cursor2.getLong(i4);
        String string = cursor2.getString(i6);
        ContentResolver contentResolver2 = contentResolver;
        if (string != null) {
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(A03, "r");
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                    if (f <= 0.0f || f2 <= 0.0f) {
                        try {
                            f = (float) Pxh.A07(mediaMetadataRetriever, 18);
                            f2 = (float) Pxh.A07(mediaMetadataRetriever, 19);
                        } catch (NumberFormatException e) {
                            0I1.A05("ReactNative", Pxf.A0l("Number format exception occurred while trying to fetch video metadata for ", A03), e);
                            mediaMetadataRetriever.release();
                            openAssetFileDescriptor.close();
                            return false;
                        } catch (Throwable th) {
                            mediaMetadataRetriever.release();
                            openAssetFileDescriptor.close();
                            throw th;
                        }
                    }
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null && (extractMetadata.equals("90") || extractMetadata.equals("270"))) {
                        float f3 = f2;
                        f2 = f;
                        f = f3;
                    }
                    A0U.putInt("playableDuration", Pxh.A07(mediaMetadataRetriever, 9) / IgNetworkConsentStorage.MAX_ENTRIES);
                    mediaMetadataRetriever.release();
                    openAssetFileDescriptor.close();
                } catch (Exception e2) {
                    e = e2;
                    sb = AnonymousClass7TE.A1A();
                    str = "Could not get video metadata for ";
                }
            } else if (string.startsWith("image")) {
                try {
                    boolean z = C227922kK.A0N;
                    int A0M = new C227922kK(A0t.getCanonicalPath()).A0M("Orientation", 1);
                    if (A0M == 6 || A0M == 8) {
                        float f4 = f2;
                        f2 = f;
                        f = f4;
                    }
                } catch (IOException e3) {
                    0I1.A05("ReactNative", Pxf.A0l("Could not get Image Exif", A03), e3);
                }
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver2.openAssetFileDescriptor(A03, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), (Rect) null, options);
                f = (float) options.outWidth;
                f2 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e4) {
                e = e4;
                sb = AnonymousClass7TE.A1A();
                str = "Could not get width/height for ";
                sb.append(str);
                Pxf.A1O(sb, A03);
                0I1.A05("ReactNative", sb.toString(), e);
                return false;
            }
        }
        A0U.putDouble(IgReactMediaPickerNativeModule.WIDTH, (double) f);
        A0U.putDouble(IgReactMediaPickerNativeModule.HEIGHT, (double) f2);
        A0U.putDouble("fileSize", (double) j);
        tm8.putMap("image", A0U);
        return true;
    }

    public static void putLocationInfo(Cursor cursor, C13948Tm8 tm8, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap A0U = Pxe.A0U();
            A0U.putDouble("longitude", d);
            A0U.putDouble(Location.LATITUDE, d2);
            tm8.putMap("location", A0U);
        }
    }

    public static void putPageInfo(Cursor cursor, C13948Tm8 tm8, int i, int i2) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putBoolean("has_next_page", AnonymousClass7TF.A1T(i, cursor.getCount()));
        if (i < cursor.getCount()) {
            A0U.putString("end_cursor", Integer.toString(i2 + i));
        }
        tm8.putMap("page_info", A0U);
    }

    public void saveToCameraRoll(String str, String str2, C13904TjR tjR) {
        new QZ2(0cp.A03(str), tjR, Pxe.A0T(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public CameraRollManager(QZK qzk) {
        super(qzk);
    }
}
