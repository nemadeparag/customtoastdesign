package paragnemade.customtoastmsg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {

    Activity activity;
    public static void simpleToast(Context context, String msg){

        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }


    public static void txttoast(Context context, String msg, String textcolor, int YOUR_BACKGROUND_COLOUR){

        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.getBackground().setColorFilter(YOUR_BACKGROUND_COLOUR, PorterDuff.Mode.SRC_IN);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        /*Here you can do anything with above textview like text.setTextColor(Color.parseColor("#000000"));*/
        //text.setBackgroundColor(Color.parseColor(backgroundcolor));
        text.setTextColor(Color.parseColor(textcolor));
        toast.show();

    }

    public static void txtlayouttoast(Context context, String msg, String textcolor, String backgroundcolor){

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.your_custom_layout, null);
        toast.setView(view);
        toast.show();

    }


    public static void txtlayouttoast2(Context context, String msg, String textcolor, int YOUR_BACKGROUND_COLOUR) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.your_custom_layout,(ViewGroup) ((Activity)context).findViewById(R.id.toast_layout_root));

        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.ic_baseline_done_24);
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setTextColor(Color.parseColor(textcolor));
        text.setText(msg);

        Toast toast = new Toast(context);
        layout.setBackgroundColor(YOUR_BACKGROUND_COLOUR);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
