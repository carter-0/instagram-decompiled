package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Qo3 extends AnonymousClass4TN {
    public static final Pattern A02 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder A00 = AnonymousClass2RN.A00.newDecoder();
    public final CharsetDecoder A01 = AnonymousClass2RN.A05.newDecoder();

    public final Metadata A06(AnonymousClass4QS r10, ByteBuffer byteBuffer) {
        String str;
        Metadata.Entry[] entryArr;
        IcyInfo icyInfo;
        CharsetDecoder charsetDecoder;
        CharsetDecoder charsetDecoder2;
        try {
            charsetDecoder2 = this.A01;
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            this.A01.reset();
            byteBuffer.rewind();
            try {
                charsetDecoder2 = this.A00;
                str = charsetDecoder2.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
                this.A00.reset();
                byteBuffer.rewind();
            } catch (Throwable th) {
                th = th;
                charsetDecoder = this.A00;
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            charsetDecoder = this.A01;
            charsetDecoder.reset();
            byteBuffer.rewind();
            throw th;
        }
        charsetDecoder2.reset();
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str2 = null;
        if (str == null) {
            entryArr = new Metadata.Entry[1];
            icyInfo = new IcyInfo((String) null, (String) null, bArr);
        } else {
            Matcher matcher = A02.matcher(str);
            String str3 = null;
            for (int i = 0; matcher.find(i); i = matcher.end()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    String A002 = C256643w7.A00(group);
                    if (A002.equals("streamurl")) {
                        str3 = group2;
                    } else if (A002.equals("streamtitle")) {
                        str2 = group2;
                    }
                }
            }
            entryArr = new Metadata.Entry[1];
            icyInfo = new IcyInfo(str2, str3, bArr);
        }
        entryArr[0] = icyInfo;
        return new Metadata(entryArr);
    }
}
