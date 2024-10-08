package X;

import android.net.Uri;
import com.facebook.ffmpeg.FFMpegMediaMetadataRetriever;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import java.io.File;
import java.io.StringReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.Q0e  reason: case insensitive filesystem */
public final class C7233Q0e implements C13725Tfv {
    public final C7235Q0h A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public final C7232Q0d AU7(Uri uri) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(uri)) {
            return (C7232Q0d) hashMap.get(uri);
        }
        C349257zq.A03("FFMpegVideoMetadataExtractor.extract");
        try {
            File A0Y = Pxg.A0Y(uri);
            FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(this.A00, A0Y.getPath());
            fFMpegMediaMetadataRetriever.initialize();
            try {
                C7232Q0d A002 = A00(fFMpegMediaMetadataRetriever, A0Y.length());
                hashMap.put(uri, A002);
                C349257zq.A01();
                C349257zq.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
                return A002;
            } catch (Exception e) {
                throw Pxe.A0c("Error extracting metadata", e);
            } catch (Throwable th) {
                C349257zq.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Exception e2) {
            throw Pxe.A0c(AnonymousClass7TG.A0m(uri, "Error initializing FFMpegMetadataExtractor ", AnonymousClass7TE.A1A()), e2);
        }
    }

    public final C7232Q0d AU8(URL url) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(url.toString())) {
            return (C7232Q0d) hashMap.get(url.toString());
        }
        C349257zq.A03("FFMpegVideoMetadataExtractor.extract");
        try {
            FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(this.A00, url.toString());
            fFMpegMediaMetadataRetriever.initialize();
            try {
                C7232Q0d A002 = A00(fFMpegMediaMetadataRetriever, -1);
                hashMap.put(0cp.A03(url.toString()), A002);
                C349257zq.A01();
                C349257zq.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
                return A002;
            } catch (Exception e) {
                throw Pxe.A0c("Error extracting metadata", e);
            } catch (Throwable th) {
                C349257zq.A01();
                try {
                    fFMpegMediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Exception e2) {
            throw Pxe.A0c(Pxf.A0l("Error initializing FFMpegMetadataExtractor ", url), e2);
        }
    }

    public C7233Q0e(C7235Q0h q0h) {
        this.A00 = q0h;
    }

    public static C7232Q0d A00(FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever, long j) {
        int i;
        SphericalMetadata sphericalMetadata;
        String str;
        long durationMs = fFMpegMediaMetadataRetriever.getDurationMs();
        int width = fFMpegMediaMetadataRetriever.getWidth();
        int height = fFMpegMediaMetadataRetriever.getHeight();
        int rotation = fFMpegMediaMetadataRetriever.getRotation();
        String colorTransferType = fFMpegMediaMetadataRetriever.getColorTransferType();
        if (colorTransferType == null) {
            i = 0;
        } else {
            i = 6;
            if (!colorTransferType.equals("smpte2084")) {
                i = 3;
            }
        }
        int i2 = 0;
        if (colorTransferType != null) {
            i2 = 1;
            switch (colorTransferType.hashCode()) {
                case -974099030:
                    if (colorTransferType.equals("smpte170m")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case -974075775:
                    str = "smpte2084";
                    break;
                case 2113018878:
                    str = "bt2020-10";
                    break;
                case 2113018909:
                    str = "bt2020-20";
                    break;
            }
            if (colorTransferType.equals(str)) {
                i2 = 6;
            }
        }
        int bitRate = fFMpegMediaMetadataRetriever.getBitRate();
        int audioBitRate = fFMpegMediaMetadataRetriever.getAudioBitRate();
        String codecType = fFMpegMediaMetadataRetriever.getCodecType();
        String audioCodecType = fFMpegMediaMetadataRetriever.getAudioCodecType();
        String copyright = fFMpegMediaMetadataRetriever.getCopyright();
        String composer = fFMpegMediaMetadataRetriever.getComposer();
        String comment = fFMpegMediaMetadataRetriever.getComment();
        String creationTime = fFMpegMediaMetadataRetriever.getCreationTime();
        SphericalMetadata sphericalMetadata2 = null;
        try {
            String sphericalMetadataXml = fFMpegMediaMetadataRetriever.getSphericalMetadataXml();
            if (sphericalMetadataXml != null) {
                XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                newInstance.setNamespaceAware(true);
                XmlPullParser newPullParser = newInstance.newPullParser();
                newPullParser.setInput(new StringReader(sphericalMetadataXml));
                String str2 = "";
                String str3 = str2;
                String str4 = str2;
                boolean z = false;
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                    if (eventType == 3) {
                        String lowerCase = newPullParser.getName().toLowerCase(Locale.US);
                        int hashCode = lowerCase.hashCode();
                        if (hashCode != 688264603) {
                            if (hashCode != 1033550429) {
                                if (hashCode == 1135581705 && lowerCase.equals("projectiontype")) {
                                    str2 = str4;
                                }
                            } else if (lowerCase.equals("spherical")) {
                                z = str4.equalsIgnoreCase("true");
                            }
                        } else if (lowerCase.equals("stereomode")) {
                            str3 = str4;
                        }
                    } else if (eventType == 4) {
                        str4 = newPullParser.getText();
                    }
                }
                if (z) {
                    C266784aL.A06(AnonymousClass7TF.A1V(str2), "projectionType is null");
                    C266784aL.A06(AnonymousClass7TF.A1V(str3), "stereoMode is null");
                    sphericalMetadata = new SphericalMetadata(str2, str3);
                } else {
                    sphericalMetadata = null;
                }
                sphericalMetadata2 = sphericalMetadata;
            }
        } catch (Exception e) {
            throw new Exception(e);
        } catch (Exception unused) {
        }
        return new C7232Q0d(sphericalMetadata2, copyright, (String) null, comment, (String) null, creationTime, codecType, audioCodecType, composer, "VIDEO", (HashMap) null, width, height, rotation, i, i2, audioBitRate, durationMs, (long) bitRate, j, AnonymousClass7TF.A1R(audioBitRate));
    }
}
