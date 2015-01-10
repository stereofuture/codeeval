FILE=$1
FILESIZE=$(stat -c%s "$FILE")
echo $FILESIZE