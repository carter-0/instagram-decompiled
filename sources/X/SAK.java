package X;

import android.content.Context;
import com.instagram.android.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class SAK {
    public static final File A00(Context context, File file) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(R.raw.bleep);
            0qQ.A07(openRawResource);
            FileOutputStream A0t = JTO.A0t(file);
            byte[] bArr = new byte[8192];
            for (int read = openRawResource.read(bArr); read > 0; read = openRawResource.read(bArr)) {
                A0t.write(bArr, 0, read);
            }
            openRawResource.close();
            A0t.close();
            return file;
        } catch (FileNotFoundException | IOException e) {
            0kD.A05("KaraokeBleepAudioConcatInteractor_copyFromRawToFile", "KaraokeBleepConvert_readBytes_exception", e);
            return null;
        }
    }
}
