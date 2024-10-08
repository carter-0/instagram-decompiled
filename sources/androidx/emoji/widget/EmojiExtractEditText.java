package androidx.emoji.widget;

import X.02V;
import X.C18429VrY;
import X.U40;
import X.VJJ;
import X.VUJ;
import X.W7o;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class EmojiExtractEditText extends ExtractEditText {
    public VUJ A00;
    public boolean A01;

    private void A00(AttributeSet attributeSet, int i, int i2) {
        if (!this.A01) {
            this.A01 = true;
            int i3 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, VJJ.A00, i, i2);
                i3 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            setMaxEmojiCount(i3);
            setKeyListener(super.getKeyListener());
        }
    }

    private VUJ getEmojiEditTextHelper() {
        VUJ vuj = this.A00;
        if (vuj != null) {
            return vuj;
        }
        VUJ vuj2 = new VUJ(this);
        this.A00 = vuj2;
        return vuj2;
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper();
            if (!(keyListener instanceof W7o)) {
                keyListener = new W7o(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().A00;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().A01;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        VUJ emojiEditTextHelper = getEmojiEditTextHelper();
        if (onCreateInputConnection == null) {
            return null;
        }
        C18429VrY vrY = emojiEditTextHelper.A02;
        if (!(onCreateInputConnection instanceof U40)) {
            return new U40(editorInfo, onCreateInputConnection, vrY.A00);
        }
        return onCreateInputConnection;
    }

    public void setEmojiReplaceStrategy(int i) {
        VUJ emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.A00 = i;
        emojiEditTextHelper.A02.A01.A00 = i;
    }

    public void setMaxEmojiCount(int i) {
        VUJ emojiEditTextHelper = getEmojiEditTextHelper();
        02V.A02(i, "maxEmojiCount should be greater than 0");
        emojiEditTextHelper.A01 = i;
        emojiEditTextHelper.A02.A01.A01 = i;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }

    public EmojiExtractEditText(Context context) {
        super(context);
        A00((AttributeSet) null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 16842862, 0);
    }
}
