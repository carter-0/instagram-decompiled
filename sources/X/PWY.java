package X;

import android.widget.TextView;

public final class PWY implements Runnable {
    public final /* synthetic */ C249703kE A00;

    public PWY(C249703kE r1) {
        this.A00 = r1;
    }

    public final void run() {
        TextView textView = ((C68040Mz7) this.A00).A03;
        if (textView.getLineCount() == 1) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(textView.getText());
            textView.setText(AnonymousClass7TF.A0l(System.getProperty("line.separator"), A1A));
        }
    }
}
