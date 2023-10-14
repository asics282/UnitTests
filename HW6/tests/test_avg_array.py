from utest1 import compare_avg_array


def test_compare_avg_array():
    array1 = [2, 4, 6, 8, 12]
    array2 = [1, 5, 6, 7, 11]

    avg1 = sum(array1) / len(array1)
    avg2 = sum(array2) / len(array2)

    assert compare_avg_array(avg1, avg2) == "Первый список имеет большее значение"


def test_compare_avg_array2_more_array1():
    array1 = [1, 3, 6, 7, 11]
    array2 = [2, 4, 6, 8, 12]

    avg1 = sum(array1) / len(array1)
    avg2 = sum(array2) / len(array2)

    assert compare_avg_array(avg1, avg2) == "Второй список имеет большее значение"


def test_equals():
    array1 = [1, 5, 6, 7, 11]
    array2 = [11, 7, 6, 5, 1]

    avg1 = sum(array1) / len(array1)
    avg2 = sum(array2) / len(array2)

    assert compare_avg_array(avg1, avg2) == "Средние значения равны"
